#! /bin/sh
# Format an SD-Card for an AT91SAM9
# (c) 2011 Ulf Samuelsson
# (c) 2009 Graeme Gregory
# This script is GPLv3 licensed!

if	[ "x$1" == "x" ] ; then
	echo	"Usage:"
	echo	"\t./mksdcard.sh	<device>	[ erase ]"
	echo	"Examples:"
	echo	"\t./mksdcard.sh	/dev/sdb"
	echo	"\t./mksdcard.sh	/dev/sdb	1024"
	exit
fi

DRIVE=$1
if	[ "1" == "1" ] ; then
HEADS=63
SECTORS=62
FATSIZE=120
else
HEADS=255
SECTORS=63
FATSIZE=34
fi
BLOCKSIZE=512

SIZE=`fdisk -l $DRIVE | grep Disk | awk '{print $5}'`
echo "DISK SIZE - $SIZE bytes"

# BLOCKCOUNT=`echo $SIZE/$BLOCKSIZE | bc`
BLOCKCOUNT=`echo	$FATSIZE*2048	| bc`
echo BLOCK COUNT - $BLOCKCOUNT blocks

CYLINDERS=`echo $SIZE/$HEADS/$SECTORS/512 | bc`
echo CYLINDERS - $CYLINDERS

if	[ "x$2" == "xerase" ] ; then
echo		`date	+%T`
printf		"%-40s"	"Erasing SD-Card"
dd if=/dev/zero of=$DRIVE bs=$BLOCKSIZE count=2048 # 65536
#$BLOCKCOUNT
echo	"COMPLETE"
echo		`date	+%T`
fi

{
echo ,$FATSIZE,0x0C,*
echo ,,0x83
#echo ,,,-
} | sfdisk -D -H $HEADS -S $SECTORS -C $CYLINDERS $DRIVE

dd if=/dev/zero of=${DRIVE}1 bs=512 count=1

mkfs.vfat -F 32 -n "boot"	${DRIVE}1
mkfs.ext3 	-L "rootfs"	${DRIVE}2


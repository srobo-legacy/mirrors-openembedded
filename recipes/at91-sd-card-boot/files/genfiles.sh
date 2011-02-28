#!/bin/sh
LOG=filenames.txt
BOOTFILE=`ls	*.bin	| grep sdcardboot`
UBOOTFILE=`ls	*.bin	| grep "u-boot"`
UIMAGEFILE=`ls	*.bin	| grep uImage`

echo	"BOOT.BIN:	$BOOTFILE"	>	$LOG
echo	"U-BOOT.BIN:	$UBOOTFILE"	>>	$LOG
echo	"UIMAGE:		$UIMAGEFILE"	>>	$LOG

mv	$BOOTFILE	BOOT.BIN
mv	$UBOOTFILE	U-BOOT.BIN
mv	$UIMAGEFILE	UIMAGE


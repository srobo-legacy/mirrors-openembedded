PR = "r5"
require u-boot_r2.inc

DEFAULT_PREFERENCE 			= "-1"
DEFAULT_PREFERENCE_at91cap9adk		= "3"
DEFAULT_PREFERENCE_at91sam9g20ek	= "3"
DEFAULT_PREFERENCE_at91sam9g10ek	= "3"
DEFAULT_PREFERENCE_at91sam9g45ekes	= "3"
DEFAULT_PREFERENCE_at91sam9g45ek	= "3"
DEFAULT_PREFERENCE_at91sam9m10ekes	= "3"
DEFAULT_PREFERENCE_at91sam9m10g45ek	= "3"
DEFAULT_PREFERENCE_at91sam9rlek		= "3"
DEFAULT_PREFERENCE_at91sam9260ek	= "3"
DEFAULT_PREFERENCE_at91sam9261ek	= "3"
DEFAULT_PREFERENCE_at91sam9263ek	= "3"

SRC_URI = "ftp://ftp.denx.de/pub/u-boot/u-boot-${PV}.tar.bz2 "

SRC_URI_append_at91 = "\
	file://at91/0001-Make-AT91-boards-compilable.patch;apply=yes \
	file://at91/0002-Add-better-dataflash-support.patch;apply=yes \
	file://at91/0003-Enable-SD-Card-boot-for-SAM9M10-G45-boards.patch;apply=yes \
	"

TARGET_LDFLAGS = ""

inherit base
# UBOOT_IMAGE ?= "u-boot-${UBOOT_MACHINE_NAME}-${PV}-${PR}.bin"
# UBOOT_SYMLINK ?= "u-boot-${UBOOT_MACHINE_NAME}.bin"

do_compile () {
	if ! [ "x${UBOOT_MACHINES}" == "x" ] ; then
		for board in ${UBOOT_MACHINES} ; do
			if ! [ `grep ${board}_config Makefile | wc -c` == 0 ] ; then
				mkdir -p binaries/${board}
				oe_runmake O=binaries/${board} distclean
				oe_runmake O=binaries/${board} ${board}_config
				oe_runmake O=binaries/${board} all
			fi
		done
	else
	       oe_runmake ${UBOOT_MACHINE}
	       oe_runmake all
	fi
}

SRC_URI[md5sum] = "9024bbceabd176ae1d52df6db2e84bda"
SRC_URI[sha256sum] = "1705772db7a18635693676abb8818542167cb131921c456a1edd0ed47e6b77fe"



DESCRIPTION = "at91 sd-card tools: Useful utilities for Booting an at91 from an SD-Card"
SECTION = "bootloaders"

PR = "r3"
DEFAULT_PREFERENCE = "-1"
DEFAULT_PREFERENCE_at91sam9g45ek = "3"
DEFAULT_PREFERENCE_at91sam9g45ekes = "3"
DEFAULT_PREFERENCE_at91sam9m10ek = "3"
DEFAULT_PREFERENCE_at91sam9m10ekes = "3"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRC_URI = " \
	file://${MACHINE}.machid \
	file://build.sh \
	file://genfiles.sh \
	file://mksdcard.sh \
	ftp://ftp.at91.com/pub/buildroot/at91sam9g45-USB-MSA.bin;name=msa \
	"
SD_TOOLS = "${DEPLOY_DIR_IMAGE}/at91-sd-card-tools"

do_install () {
	install	-d	${SD_TOOLS}
	if [ -e ${WORKDIR}/${MACHINE}.machid ] ; then
		install -m 0755	${WORKDIR}/${MACHINE}.machid	${SD_TOOLS}/${MACHINE}.machid
	fi
	install -m 0755	${WORKDIR}/build.sh			${SD_TOOLS}/build.sh
	install -m 0755	${WORKDIR}/genfiles.sh			${SD_TOOLS}/genfiles.sh
	install -m 0755	${WORKDIR}/mksdcard.sh			${SD_TOOLS}/mksdcard.sh
	install -m 0755	${WORKDIR}/at91sam9g45-USB-MSA.bin	${SD_TOOLS}/PROGRAM.BIN

}

SRC_URI[msa.md5sum] = "72f9ad8901a16eccb7468f5d9f5c21a5"
SRC_URI[msa.sha256sum] = "75168ad52fa4429ad718630235720c1d391a1a05d058c8b4a49a110c615c2c10"


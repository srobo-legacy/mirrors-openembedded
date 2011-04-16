require linux.inc

PR = "r2"

# Mark archs/machines that this kernel supports
DEFAULT_PREFERENCE = "-1"

DEFAULT_PREFERENCE_akita = "1"
DEFAULT_PREFERENCE_at572d940hfek = "4"
DEFAULT_PREFERENCE_at91cap9adk = "4"
DEFAULT_PREFERENCE_at91rm9200 = "4"
DEFAULT_PREFERENCE_at91rm9200dk = "4"
DEFAULT_PREFERENCE_at91rm9200ek = "4"
DEFAULT_PREFERENCE_at91sam9260ek = "4"
DEFAULT_PREFERENCE_at91sam9261ek = "4"
DEFAULT_PREFERENCE_at91sam9263ek = "4"
DEFAULT_PREFERENCE_at91sam9g10ek = "4"
DEFAULT_PREFERENCE_at91sam9g20ek = "4"
DEFAULT_PREFERENCE_at91sam9g20ek_2mmc = "4"
DEFAULT_PREFERENCE_at91sam9g45ekes = "4"
DEFAULT_PREFERENCE_at91sam9m10ekes = "4"
DEFAULT_PREFERENCE_at91sam9m10g45ek = "4"
DEFAULT_PREFERENCE_at91sam9rlek = "4"
DEFAULT_PREFERENCE_at91sam9xeek = "4"
DEFAULT_PREFERENCE_c7x0 = "1"
DEFAULT_PREFERENCE_collie = "1"
DEFAULT_PREFERENCE_poodle = "1"
DEFAULT_PREFERENCE_spitz = "1"
DEFAULT_PREFERENCE_tosa = "1"

SRC_URI = "${KERNELORG_MIRROR}/pub/linux/kernel/v2.6/linux-${PV}.tar.bz2;name=kernel \
           ${KERNELORG_MIRROR}/pub/linux/kernel/v2.6/patch-${PV}.2.bz2;apply=yes;name=stablepatch \
           file://defconfig "

#	${KERNELORG_MIRROR}/pub/linux/kernel/v2.6/patch-${PV}.3.bz2;apply=yes;name=minor3 \

SRC_URI_at91 = "${KERNELORG_MIRROR}/pub/linux/kernel/v2.6/linux-${PV}.tar.bz2;name=kernel \
	file://0001-Maxim-patch-updated-from-2.6.30-to-2.6.38.patch;apply=yes \
	file://0002-Add-MACB-TX-Buffer-in-SRAM-support.patch;apply=yes \
	file://0003-AT91-atmel-mci-Platform-configuration-to-the-the-atm.patch;apply=yes \
	file://0004-at91_mci-Do-a-reset-after-each-request.patch;apply=yes \
	file://0005-at91-at91sam9g20ek-modify-dual-slot-evaluation-kit.patch;apply=yes \	
	file://0006-at91-add-gpio-buttons-to-at91sam9g20-ek-2mmc.patch;apply=yes \
	file://0007-Bug-workaround-for-channel-in-ac97.patch;apply=yes \
	file://0008-input-atmel_tsadcc-report-fake-pressure-measure.patch;apply=yes \
	file://0009-at91-No-more-SD-MMC-Write-Protect-pin-connected-on-a.patch;apply=yes \
	file://0010-net-macb-modify-SRAM-location-of-descriptor-buffers-.patch;apply=yes \
	file://0011-at91-add-pwm-support-in-Kconfig-for-at91sam9g45.patch;apply=yes \
	file://0012-at91-add-I2C-definitions-for-at91sam9g20ek-boards.patch;apply=yes \
	file://0013-at91-add-at91sam9g10ek-defconfig-file.patch;apply=yes \
	file://0014-t91-add-at91sam9m10ekes-support.patch;apply=yes \
	file://0015-at91-at91sam9m10-add-dma-touchscreen-mmc-usb-host-an.patch;apply=yes \
	file://0016-at91-at91sam9m10-add-video-decoder-clock.patch;apply=yes \
	file://0017-at91sam9m10-add-on2-8170-gpl-modules.patch;apply=yes \
	file://0018-sound-atmel-ac97-add-warm-reset-if-no-reset-pin.patch;apply=yes \
	file://0019-at91-introduce-at91sam9m10g45ek-board.patch;apply=yes \
	file://0020-input-atmel_tsadcc-introduce-changes-needed-for-at91.patch;apply=yes \
	file://0021-at91-Clean-up-choiuce-of-sam9m10-g45-boards.patch;apply=yes \
	file://0022-at91-Add-support-for-configurable-NAND-flash-partiti.patch;apply=yes \
	file://0023-at91-Update-defconfig-s-for-atmel-at91-boards.patch;apply=yes \
	file://0024-at91-Cleanup-of-defconfig-s.patch;apply=yes \
	file://defconfig "

SRC_URI_append_akita = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "
SRC_URI_append_c7x0 = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "
SRC_URI_append_collie = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "
SRC_URI_append_poodle = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "
SRC_URI_append_tosa = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "
SRC_URI_append_spitz = " file://${LOGO_SIZE}/logo_linux_clut224.ppm.bz2 "

SRC_URI[kernel.md5sum] = "7d471477bfa67546f902da62227fa976"
SRC_URI[kernel.sha256sum] = "72f0cfaefb8dc86b219d5a742dd0375332627641ecbdf5badd3158e2127b9304"
SRC_URI[stablepatch.md5sum] = "599badab31c4920d4122133208c810d7"
SRC_URI[stablepatch.sha256sum] = "8279d5b883cb44f4d3cf28b4db9b3c37c9c6dba45bb5884e8601950ee59892c4"

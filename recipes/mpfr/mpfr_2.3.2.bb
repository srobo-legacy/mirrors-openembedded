require mpfr.inc

DEPENDS = "gmp"
PR = "r0"
SRC_URI = "http://www.mpfr.org/mpfr-${PV}/mpfr-${PV}.tar.bz2"
S = "${WORKDIR}/mpfr-${PV}"

BBCLASSEXTEND="native"

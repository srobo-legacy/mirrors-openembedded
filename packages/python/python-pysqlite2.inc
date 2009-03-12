DESCRIPTION = "Python interface to SQLite 3"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "BSD"
SRCNAME = "pysqlite"
PR = "ml2"

SRC_URI = "http://initd.org/pub/software/pysqlite/releases/2.4/${PV}/${SRCNAME}-${PV}.tar.gz \
           file://fix-setup.patch;patch=1"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit distutils

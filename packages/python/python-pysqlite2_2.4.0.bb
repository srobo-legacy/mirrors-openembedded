require python-pysqlite2.inc


DEPENDS = "sqlite3"
RDEPENDS = "\
 python-datetime \
 python-lang \
 python-crypt \
 python-io \
 python-threading \
 python-unittest \
 python-zlib \
"

do_install_append() {
    install -d ${D}${datadir}/doc/
    mv ${D}${datadir}/pysqlite2-doc ${D}${datadir}/doc/${PN}
}

PACKAGES =+ "${PN}-tests"
FILES_${PN}-tests = "${libdir}/${PYTHON_DIR}/pysqlite2/test"
RDEPENDS_${PN}-tests = "${PN}"

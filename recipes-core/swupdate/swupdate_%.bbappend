FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://html/favicon.png \
	file://html/logo.png \
	file://html/background.jpg \
	file://swupdate.cfg \
	file://swupdate.default \
"

do_install_append () {
	install -m 644 ${WORKDIR}/html/favicon.png ${D}/www/images/
	install -m 644 ${WORKDIR}/html/logo.png ${D}/www/images/
	install -m 644 ${WORKDIR}/html/background.jpg ${D}/www/images/

	install -m 644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}/
	install -d ${D}${sysconfdir}/default/
	install -m 644 ${WORKDIR}/swupdate.default ${D}${sysconfdir}/default/swupdate
}

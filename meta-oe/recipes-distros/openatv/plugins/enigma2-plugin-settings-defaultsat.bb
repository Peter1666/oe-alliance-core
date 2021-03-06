SUMMARY = "openATV default SAT Settings Archiv"
MAINTAINER = "openATV Team"
SECTION = "base"
LICENSE = "proprietary"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

inherit gitpkgv
SRCREV = "${AUTOREV}"
PV = "4.0+git${SRCPV}"
PKGV = "4.0+git${GITPKGV}"
VER ="4.0"
PR = "r0"

SRC_URI="git://github.com/openatv/enigma2-plugin-settings-defaultsat.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/etc/defaultsat.tar.gz"


do_install() {
    install -d ${D}/${sysconfdir}
    tar -czf ${D}/${sysconfdir}/defaultsat.tar.gz -C ${S}/etc/enigma2 .
}
SUMMARY = "Manage OpenViX-HD skins."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGES = "${PN}"

PV = "${IMAGE_VERSION}"
PR = "r0"

inherit packagegroup

DEPENDS = "enigma2"

RDEPENDS_${PN} = "\
    enigma2-plugin-skinpacks-dreamplex-youplex-blue \
    enigma2-plugin-skinpacks-dreamplex-youplex-red \
    enigma2-plugin-skinpacks-dreamplex-youplex-green \
    enigma2-plugin-skinpacks-dreamplex-youplex-purple \
    enigma2-plugin-skinpacks-dreamplex-plex-experience \
    "

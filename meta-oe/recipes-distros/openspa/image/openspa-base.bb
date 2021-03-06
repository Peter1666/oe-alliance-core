SUMMARY = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"

PV = "1.0"
PR = "r4"

inherit packagegroup

RDEPENDS_${PN} = " \
    oe-alliance-base \
    openspa-enigma2 \
    openspa-bootlogo \
    openspa-spinner \
    openssh-sftp-server \
    ntfs-3g \
    hddtemp \
    busybox-cron \
    python-imaging \
    rtmpdump \
    packagegroup-base-smbfs-client \
    ${@base_contains("MACHINE_FEATURES", "dreamboxv1", "", "ofgwrite", d)} \
    ${@base_contains("TUNE_FEATURES", "arm", "glibc-compat", "", d)} \
    bash \
    wget \
    "

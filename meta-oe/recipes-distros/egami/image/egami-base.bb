SUMMARY = "Base packages require for image."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

ALLOW_EMPTY_${PN} = "1"
PACKAGES = "${PN}"

PV = "1.0"
PR = "r2"

inherit packagegroup

RDEPENDS_${PN} = "\
	oe-alliance-base \
	\
	egami-enigma2 \
	egami-bootlogo \
	egami-version-info \
	egami-base-files \
	\
	python-imaging python-compression \
	rtmpdump \
	libcrypto-compat-0.9.7 \
	packagegroup-base-smbfs-client \
	busybox-cron \
	ntfs-3g \
	dosfstools \
	hddtemp hdparm \
	dvbsnoop \
	djmount \
"
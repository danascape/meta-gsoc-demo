SUMMARY = "Flutter GSoC Demo Application"
LICENSE = "Apache 2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/danascape/flutter_gsoc_demo.git;branch=master;protocol=https"
SRCREV = "6e2ac396ab4e354e0744e062264485b7ef22c58a" 

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "flutter_gsoc_demo"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app

do_install:append() {
    bbwarn "Destination directory (D): ${D}"
    bbwarn "Source directory (S): ${S}"
}

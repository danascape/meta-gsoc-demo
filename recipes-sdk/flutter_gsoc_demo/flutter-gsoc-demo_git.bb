SUMMARY = "Flutter GSoC Demo Application"
DESCRIPTION = "A Flutter based IVI Application"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"
SECTION = "graphics"

SRC_URI = "git://github.com/danascape/flutter_gsoc_demo.git;branch=master;protocol=https \
           file://agl-app-flutter@flutter-gsoc-demo.service \
           "

SRCREV = "3beb92592eee737a96d7f258066f2d9b85d641ed"
S = "${WORKDIR}/git"

inherit flutter-app

# flutter-app
PUBSPEC_APPNAME = "flutter_gsoc_demo"
PUBSPEC_IGNORE_LOCKFILE = "1"
FLUTTER_BUILD_ARGS = "bundle -v"

# agl-app
#AGL_APP_TEMPLATE = "agl-app-flutter"
#AGL_APP_ID = "flutter_gsoc_demo"
#AGL_APP_NAME = "Flutter Demo App"

do_install:append() {
    install -D -m 0644 ${WORKDIR}/agl-app-flutter@flutter-gsoc-demo.service ${D}${systemd_system_unitdir}/agl-app-flutter@flutter-gsoc-demo.service
}

do_compile[network] = "1"

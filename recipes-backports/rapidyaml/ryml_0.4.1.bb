SUMMARY = "Rapid YAML"
AUTHOR = "biojppm"
HOMEPAGE = "https://github.com/biojppm/rapidyaml.git"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b5d973344b3c7bbf7535f0e6e002d017"

SRC_URI = "gitsm://github.com/biojppm/rapidyaml.git;branch=master;protocol=https \
           "

inherit cmake

S = "${WORKDIR}/git"
PV = "v0.4.1"

SRCREV = "213b201d264139cd1b887790197e08850af628e3"

# do_configure:prepend() {
#   cd ${WORKDIR}/git
#   git submodule update --init --recursive
# }

# EXTRA_OECMAKE += " \
# 	-DBUILD_TZ_LIB=ON \
# 	-DHAS_REMOTE_API=OFF \
# 	-DUSE_AUTOLOAD=OFF \
# 	-DUSE_SYSTEM_TZ_DB=ON \
# "

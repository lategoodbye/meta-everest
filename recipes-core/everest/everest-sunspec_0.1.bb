LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/EVerest/libsunspec.git;branch=main;protocol=https"

inherit cmake

DEPENDS = "\
    everest-cmake \
    boost \
    nlohmann-json \
    everest-log \
    everest-modbus \
"

S = "${WORKDIR}/git"

#SRCREV = "${AUTOREV}"
SRCREV = "449e66b1f9a1f9409557ba9b5c29bf0faac7bf12"
PV = "0.1+git${SRCPV}"

FILES_${PN} += "${datadir}/everest/*"

EXTRA_OECMAKE += "-DDISABLE_EDM=ON"

DESCRIPTION = "A console image with wifi support application for SoMLabs Board"
LICENSE = "MIT"

IMAGE_FEATURES += "package-management ssh-server-openssh"

NETWORK_APP = " \
    openssh openssh-keygen openssh-sftp-server \
"

IMAGE_LINGUAS = "pl-pl"

inherit core-image

SYSTEM_TOOLS_INSTALL = " \
    i2c-tools \
    memtester \
    sysbench \
    tzdata \
    devmem2 \
    minicom \
    u-boot-somlabs-fw-utils \
"

KERNEL_EXTRA_INSTALL = " \
    kernel-devicetree \
    kernel-modules \
    murata-fwmac-fw \
 "

UTILITIES_INSTALL = " \
    coreutils \
    gdbserver \
    mtd-utils \
    ldd \
    libstdc++ \
    libstdc++-dev \
    openssh-sftp \
    resize-rootfs \
    ppp \
    rng-tools \
    util-linux \
"

TSLIB = " \
    tslib \
    tslib-calibrate \
    tslib-conf \
    tslib-dev \
    tslib-tests \
"

WIFI_SUPPORT = " \
    crda \
    iw \
    linux-firmware-rtl8192ce \
    linux-firmware-rtl8192cu \
    linux-firmware-rtl8192su \
    linux-firmware-ralink \
    wpa-supplicant \
    bluez5 \
    wpa-supplicant-passphrase \
    wpa-supplicant-cli \
    network-config-misc \
    iproute2 \
    iproute2-tc \
"

SWUPDATE = " \
    libconfig \
    swupdate \
    swupdate-www \
    util-linux-sfdisk \
    e2fsprogs-mke2fs \
"
 
IMAGE_INSTALL += " \
  ${SYSTEM_TOOLS_INSTALL} \
  ${UTILITIES_INSTALL} \
  ${NETWORK_APP} \
  ${WIFI_SUPPORT} \
  ${KERNEL_EXTRA_INSTALL} \
  ${TSLIB} \
  ${SWUPDATE} \
"

#Always add cmake to sdk
TOOLCHAIN_HOST_TASK_append = " nativesdk-cmake"

PACKAGECONFIG_DISTRO_append_pn_qtbase = " linuxfb tslib "


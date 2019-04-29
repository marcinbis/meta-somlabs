FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
  file://0001-kernel-logo-change.patch \
	file://0002-fix-kprobes-optimized-kprobes-illegal-instruction.patch \
	file://somlabs-visionsom-6ul.dts \
	file://somlabs-visionsom-6ul-emmc.dts \
	file://somlabs-visionsom-6ul-nand.dts \
	file://somlabs-visionsom-6ull.dts \
	file://somlabs-visionsom-6ull-emmc.dts \
	file://somlabs-visionsom-6ull-nand.dts \
"

do_compile_prepend () {
	cp ${WORKDIR}/*.dts ${S}/arch/${ARCH}/boot/dts
}

SRCREV = "237548825d548d29f57dad6f1d7904a191c2e265"

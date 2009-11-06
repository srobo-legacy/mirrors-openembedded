DESCRIPTION = "SHR Feed"
PR = "r24"
PV = "1.0"
LICENSE = "GPL"

inherit task

RDEPENDS_${PN} += "\
		python-elementary \
		openmoko-agpsui \
		mc \
		mplayer \
		x11vnc \
		omview \
		openvpn \
		navit \
		pythm \
		fbreader \
		omoney \
		enotes \
		epdfview \
		pyphonelog \
		pingus \
		openmoocow \
		dosbox \
		vagalume \
		python-pygame \
		mokoko \
		exhibit \
		edje-viewer \
		obexpush \
		obexftp \
		mtpaint \
		telepathy-python \
		intone-video \
		ipkg-link \
		ipkg-utils \
		mysql \
		gpe-calendar \
		gpe-todo \
		gpe-scap \
		gpe-sketchbook \
		gpe-filemanager \
		gpe-gallery \
		gpe-timesheet \
		gpe-contacts \
		fltk-chess \
		remoko \
#		shr-config \
		shr-today \
                shr-theme-neo \
		shr-theme-niebiee \
		shr-splash \
		shr-splash-theme-simple \
		shr-splash-theme-dontpanic \
		shr-splash-theme-handy \
		shr-splash-theme-niebiee \
		openbmap-logger \
		pisi \
		ffalarms \
		libnotify \
		accelges \
		ebrainy \
		sms-sentry \
		cellhunter \
		dillo2 \
		usbmode \
		pyefl-sudoku \
		tasks \
		dates \
		omnewrotate \
		xchat \
		python-pyid3lib \
#		libframeworkd-phonegui-efl2 \
		intone \
		vim \
		vpnc \
		emacs \
		mcabber \
		gdb \
		oh-puzzles \
		links-x11 \
		e-wm-illume-dict-pl \
		callrec \
		dictator \
		midori \
		numptyphysics \
		pidgin \
		libpurple-protocol-msn \
		libpurple-protocol-icq \
		vagalume \
		ppp \
		bluez-hcidump \
		kbdd \
		kexec-tools \
		claws-mail \
		claws-plugin-mailmbox \
#		claws-plugin-gtkhtml2-viewer \
		claws-plugin-rssyl \
		mc \
		iotop \
		xprop \
		xev \
		xwininfo \
		tcpdump \
		lsof \
		zsh \
		gzip \
		zip \
		microcom \
		minicom \
		leafpad \
		abiword \
		aspell \
		enchant \
		joe \
		nano \
		ntpclient \
		ntp \
		tor \
		vnc \
#		gpsdrive \
		wxwidgets \
		x11vnc \
		xf86-video-glamo \
#		libswt3.4-gtk-java \
		cacao \
#		jamvm \
		dbus-x11 \
		bluez-utils-alsa \
		python-pybluez \
		xournal \
		evince \
#		asterisk \
		git \
		ruby \
		orrery \
		synergy \
		irssi \
		zhone \
		paroli \
		cu \
		net-tools \
		iproute2 \
		iputils \
		i2c-tools \
		psmisc \
		debianutils \
		tcptraceroute \
		task-proper-tools \
		wmiconfig \
		netkit-telnet \
		bind-utils \
		bubble-keyboard \
		intuition \
		gridpad \
#		essential-dialer \
		font-adobe-100dpi \
		font-adobe-75dpi \
		font-adobe-utopia-100dpi \
		font-adobe-utopia-75dpi \
#		font-adobe-utopia-type1 \
		font-arabic-misc \
		font-bh-100dpi \
		font-bh-75dpi \
		font-bh-lucidatypewriter-100dpi \
		font-bh-lucidatypewriter-75dpi \
#		font-bh-ttf \
#		font-bh-type1 \
		font-bitstream-100dpi \
		font-bitstream-75dpi \
		font-bitstream-speedo \
#		font-bitstream-type1 \
		font-cronyx-cyrillic \
		font-cursor-misc \
		font-daewoo-misc \
		font-dec-misc \
#		font-ibm-type1 \
		font-isas-misc \
		font-jis-misc \
		font-micro-misc \
		font-misc-cyrillic \
#		font-misc-ethiopic \
#		font-misc-meltho \
		font-misc-misc \
		font-mutt-misc \
		font-schumacher-misc \
		font-screen-cyrillic \
		font-sony-misc \
		font-sun-misc \
		font-winitzki-cyrillic \
#		font-xfree86-type1 \
#		msn-pecan \
		erminig \
		qwo \
		fso-apm \
		fso-abyss \
		fsousaged \
		fsodeviced \
		fsonetworkd \
		fsotimed \
		opimd-utils \
		omgps \
		shr-launcher \
		e-tasks \
		elementary-theme-sixteen \
		e-wm-theme-illume-sixteen \
		e-wm-theme-illume-niebiee \
		elementary-theme-niebiee \
		elmdentica \
		shr-installer \
		eject \
		illume-keyboard-german \
		illume-keyboard-arabic \
		illume-keyboard-browse \
		illume-keyboard-danish \
		illume-keyboard-default-alt \
		illume-keyboard-dutch \
		illume-keyboard-dvorak \
		illume-keyboard-french \
		illume-keyboard-hebrew \
		illume-keyboard-numeric-alt \
		illume-keyboard-russian-terminal \
		illume-keyboard-russian \
		python-xlib \
		xcompmgr \
		man \
		man-pages \
		aceofpenguins-launcher \
		om-neon \
		ipython \
		phoneme-advanced-foundation \
		eve \
		python-pybluez \
		x11perf \
		pyring \
		bt-configure \
		bt-gps \
		advancedcaching \
		glamo-dri-tests \
"

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v64 extends n81 {

    /* renamed from: e */
    private final byte[] f24612e;

    /* renamed from: f */
    private final DatagramPacket f24613f;

    /* renamed from: g */
    private Uri f24614g;

    /* renamed from: h */
    private DatagramSocket f24615h;

    /* renamed from: i */
    private MulticastSocket f24616i;

    /* renamed from: j */
    private InetAddress f24617j;

    /* renamed from: k */
    private InetSocketAddress f24618k;

    /* renamed from: l */
    private boolean f24619l;

    /* renamed from: m */
    private int f24620m;

    public v64(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f24612e = bArr;
        this.f24613f = new DatagramPacket(bArr, 0, 2000);
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws u64 {
        if (i2 == 0) {
            return 0;
        }
        if (this.f24620m == 0) {
            try {
                this.f24615h.receive(this.f24613f);
                int length = this.f24613f.getLength();
                this.f24620m = length;
                mo19649n(length);
            } catch (SocketTimeoutException e) {
                throw new u64(e, 2002);
            } catch (IOException e2) {
                throw new u64(e2, 2001);
            }
        }
        int length2 = this.f24613f.getLength();
        int i3 = this.f24620m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f24612e, length2 - i3, bArr, i, min);
        this.f24620m -= min;
        return min;
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f24614g;
    }

    /* renamed from: h */
    public final void mo15697h() {
        this.f24614g = null;
        MulticastSocket multicastSocket = this.f24616i;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f24617j);
            } catch (IOException unused) {
            }
            this.f24616i = null;
        }
        DatagramSocket datagramSocket = this.f24615h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f24615h = null;
        }
        this.f24617j = null;
        this.f24618k = null;
        this.f24620m = 0;
        if (this.f24619l) {
            this.f24619l = false;
            mo19650o();
        }
    }

    /* renamed from: m */
    public final long mo15698m(uf1 uf1) throws u64 {
        Uri uri = uf1.f24320a;
        this.f24614g = uri;
        String host = uri.getHost();
        int port = this.f24614g.getPort();
        mo19651p(uf1);
        try {
            this.f24617j = InetAddress.getByName(host);
            this.f24618k = new InetSocketAddress(this.f24617j, port);
            if (this.f24617j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f24618k);
                this.f24616i = multicastSocket;
                multicastSocket.joinGroup(this.f24617j);
                this.f24615h = this.f24616i;
            } else {
                this.f24615h = new DatagramSocket(this.f24618k);
            }
            this.f24615h.setSoTimeout(8000);
            this.f24619l = true;
            mo19652q(uf1);
            return -1;
        } catch (SecurityException e) {
            throw new u64(e, 2006);
        } catch (IOException e2) {
            throw new u64(e2, 2001);
        }
    }
}

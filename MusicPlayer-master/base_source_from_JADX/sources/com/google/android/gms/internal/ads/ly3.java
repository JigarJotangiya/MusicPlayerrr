package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ly3 {

    /* renamed from: a */
    public final C5689w f19657a;

    /* renamed from: b */
    public final int f19658b;

    /* renamed from: c */
    public final int f19659c = 0;

    /* renamed from: d */
    public final int f19660d;

    /* renamed from: e */
    public final int f19661e;

    /* renamed from: f */
    public final int f19662f;

    /* renamed from: g */
    public final int f19663g;

    /* renamed from: h */
    public final int f19664h;

    /* renamed from: i */
    public final kx3[] f19665i;

    public ly3(C5689w wVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, kx3[] kx3Arr) {
        this.f19657a = wVar;
        this.f19658b = i;
        boolean z2 = false;
        this.f19660d = i3;
        this.f19661e = i4;
        this.f19662f = i5;
        this.f19663g = i6;
        this.f19665i = kx3Arr;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
        gs1.m24488f(minBufferSize != -2 ? true : z2);
        this.f19664h = wy2.m33417L(minBufferSize * 4, ((int) mo19299a(250000)) * i3, Math.max(minBufferSize, ((int) mo19299a(750000)) * i3));
    }

    /* renamed from: a */
    public final long mo19299a(long j) {
        return (j * ((long) this.f19661e)) / 1000000;
    }

    /* renamed from: b */
    public final long mo19300b(long j) {
        return (j * 1000000) / ((long) this.f19661e);
    }

    /* renamed from: c */
    public final AudioTrack mo19301c(boolean z, fc3 fc3, int i) throws yx3 {
        AudioTrack audioTrack;
        try {
            int i2 = wy2.f25579a;
            if (i2 >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(fc3.mo17518a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.f19661e).setChannelMask(this.f19662f).setEncoding(this.f19663g).build()).setTransferMode(1).setBufferSizeInBytes(this.f19664h).setSessionId(i).setOffloadedPlayback(false).build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(fc3.mo17518a(), new AudioFormat.Builder().setSampleRate(this.f19661e).setChannelMask(this.f19662f).setEncoding(this.f19663g).build(), this.f19664h, 1, i);
            } else {
                int i3 = fc3.f16530a;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f19661e, this.f19662f, this.f19663g, this.f19664h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f19661e, this.f19662f, this.f19663g, this.f19664h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new yx3(state, this.f19661e, this.f19662f, this.f19664h, this.f19657a, false, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new yx3(0, this.f19661e, this.f19662f, this.f19664h, this.f19657a, false, e);
        }
    }
}

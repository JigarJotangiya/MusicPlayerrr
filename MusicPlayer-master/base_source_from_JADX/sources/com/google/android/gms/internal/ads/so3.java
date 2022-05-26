package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class so3 extends kl3 {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final kl3 zzd;
    /* access modifiers changed from: private */
    public final kl3 zze;
    private final int zzf;
    private final int zzg;

    private so3(kl3 kl3, kl3 kl32) {
        this.zzd = kl3;
        this.zze = kl32;
        int zzd2 = kl3.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + kl32.zzd();
        this.zzg = Math.max(kl3.zzf(), kl32.zzf()) + 1;
    }

    /* renamed from: p */
    private static kl3 m30843p(kl3 kl3, kl3 kl32) {
        int zzd2 = kl3.zzd();
        int zzd3 = kl32.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        kl3.zzC(bArr, 0, 0, zzd2);
        kl32.zzC(bArr, 0, zzd2, zzd3);
        return new il3(bArr);
    }

    static kl3 zzG(kl3 kl3, kl3 kl32) {
        if (kl32.zzd() == 0) {
            return kl3;
        }
        if (kl3.zzd() == 0) {
            return kl32;
        }
        int zzd2 = kl3.zzd() + kl32.zzd();
        if (zzd2 < 128) {
            return m30843p(kl3, kl32);
        }
        if (kl3 instanceof so3) {
            so3 so3 = (so3) kl3;
            if (so3.zze.zzd() + kl32.zzd() < 128) {
                return new so3(so3.zzd, m30843p(so3.zze, kl32));
            } else if (so3.zzd.zzf() > so3.zze.zzf() && so3.zzg > kl32.zzf()) {
                return new so3(so3.zzd, new so3(so3.zze, kl32));
            }
        }
        if (zzd2 >= zzc(Math.max(kl3.zzf(), kl32.zzf()) + 1)) {
            return new so3(kl3, kl32);
        }
        return oo3.m28633a(new oo3((no3) null), kl3, kl32);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kl3)) {
            return false;
        }
        kl3 kl3 = (kl3) obj;
        if (this.zzc != kl3.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = kl3.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        qo3 qo3 = new qo3(this, (po3) null);
        hl3 a = qo3.next();
        qo3 qo32 = new qo3(kl3, (po3) null);
        hl3 a2 = qo32.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd2 = a.zzd() - i;
            int zzd3 = a2.zzd() - i2;
            int min = Math.min(zzd2, zzd3);
            if (i == 0) {
                z = a.zzg(a2, i2, min);
            } else {
                z = a2.zzg(a, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 < i4) {
                if (min == zzd2) {
                    a = qo3.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == zzd3) {
                    a2 = qo32.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new mo3(this);
    }

    public final byte zza(int i) {
        kl3.zzB(i, this.zzc);
        return zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.zze(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzi(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzj(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i5), 0, i3 - i5);
    }

    public final kl3 zzk(int i, int i2) {
        int zzq = kl3.zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return kl3.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        kl3 kl3 = this.zzd;
        return new so3(kl3.zzk(i, kl3.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    public final sl3 zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        qo3 qo3 = new qo3(this, (po3) null);
        while (qo3.hasNext()) {
            arrayList.add(qo3.next().zzn());
        }
        int i = sl3.f23542e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new ol3(arrayList, i2, true, (nl3) null);
        }
        return new ql3(new cn3(arrayList), 4096, (pl3) null);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(bl3 bl3) throws IOException {
        this.zzd.zzo(bl3);
        this.zze.zzo(bl3);
    }

    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        kl3 kl3 = this.zze;
        if (kl3.zzj(zzj, 0, kl3.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final fl3 zzs() {
        return new mo3(this);
    }
}

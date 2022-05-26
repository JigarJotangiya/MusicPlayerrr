package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class il3 extends hl3 {
    protected final byte[] zza;

    il3(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kl3) || zzd() != ((kl3) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof il3)) {
            return obj.equals(this);
        }
        il3 il3 = (il3) obj;
        int zzr = zzr();
        int zzr2 = il3.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(il3, 0, zzd());
        }
        return false;
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zza[i];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg(kl3 kl3, int i, int i2) {
        if (i2 <= kl3.zzd()) {
            int i3 = i + i2;
            if (i3 > kl3.zzd()) {
                int zzd = kl3.zzd();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(zzd);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(kl3 instanceof il3)) {
                return kl3.zzk(i, i3).equals(zzk(0, i2));
            } else {
                il3 il3 = (il3) kl3;
                byte[] bArr = this.zza;
                byte[] bArr2 = il3.zza;
                int zzc = zzc() + i2;
                int zzc2 = zzc();
                int zzc3 = il3.zzc() + i;
                while (zzc2 < zzc) {
                    if (bArr[zzc2] != bArr2[zzc3]) {
                        return false;
                    }
                    zzc2++;
                    zzc3++;
                }
                return true;
            }
        } else {
            int zzd2 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(zzd2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        return zm3.m34699d(i, this.zza, zzc() + i2, i3);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return aq3.m20918f(i, this.zza, zzc, i3 + zzc);
    }

    public final kl3 zzk(int i, int i2) {
        int zzq = kl3.zzq(i, i2, zzd());
        if (zzq == 0) {
            return kl3.zzb;
        }
        return new el3(this.zza, zzc() + i, zzq);
    }

    public final sl3 zzl() {
        return sl3.m30776g(this.zza, zzc(), zzd(), true);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public final void zzo(bl3 bl3) throws IOException {
        ((ul3) bl3).mo21313E(this.zza, zzc(), zzd());
    }

    public final boolean zzp() {
        int zzc = zzc();
        return aq3.m20922j(this.zza, zzc, zzd() + zzc);
    }
}

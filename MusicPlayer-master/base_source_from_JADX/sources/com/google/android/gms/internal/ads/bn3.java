package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class bn3 extends IOException {
    private zn3 zza = null;
    private boolean zzb;

    public bn3(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static an3 zza() {
        return new an3("Protocol message tag had invalid wire type.");
    }

    static bn3 zzb() {
        return new bn3("Protocol message end-group tag did not match expected tag.");
    }

    static bn3 zzc() {
        return new bn3("Protocol message contained an invalid tag (zero).");
    }

    static bn3 zzd() {
        return new bn3("Protocol message had invalid UTF-8.");
    }

    static bn3 zze() {
        return new bn3("CodedInputStream encountered a malformed varint.");
    }

    static bn3 zzf() {
        return new bn3("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static bn3 zzg() {
        return new bn3("Failed to parse the message.");
    }

    static bn3 zzi() {
        return new bn3("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static bn3 zzj() {
        return new bn3("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final bn3 zzh(zn3 zn3) {
        this.zza = zn3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzk() {
        this.zzb = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl() {
        return this.zzb;
    }

    public bn3(String str) {
        super(str);
    }
}

package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.C1166d;

public class AudioAttributesCompat implements C1166d {

    /* renamed from: b */
    private static final SparseIntArray f3348b;

    /* renamed from: c */
    static boolean f3349c;

    /* renamed from: a */
    public AudioAttributesImpl f3350a;

    /* renamed from: androidx.media.AudioAttributesCompat$a */
    public static class C0724a {

        /* renamed from: a */
        final AudioAttributesImpl.C0725a f3351a;

        public C0724a() {
            if (AudioAttributesCompat.f3349c) {
                this.f3351a = new AudioAttributesImplBase.C0728a();
                return;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                this.f3351a = new AudioAttributesImplApi26.C0727a();
            } else if (i >= 21) {
                this.f3351a = new AudioAttributesImplApi21.C0726a();
            } else {
                this.f3351a = new AudioAttributesImplBase.C0728a();
            }
        }

        /* renamed from: a */
        public AudioAttributesCompat mo4277a() {
            return new AudioAttributesCompat(this.f3351a.mo4286d());
        }

        /* renamed from: b */
        public C0724a mo4278b(int i) {
            this.f3351a.mo4284b(i);
            return this;
        }

        /* renamed from: c */
        public C0724a mo4279c(int i) {
            this.f3351a.mo4283a(i);
            return this;
        }

        /* renamed from: d */
        public C0724a mo4280d(int i) {
            this.f3351a.mo4285c(i);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3348b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    /* renamed from: c */
    static int m4308c(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
        }
    }

    /* renamed from: e */
    static String m4309e(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                return "unknown usage " + i;
        }
    }

    /* renamed from: f */
    public static AudioAttributesCompat m4310f(Object obj) {
        if (f3349c) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    /* renamed from: a */
    public int mo4272a() {
        return this.f3350a.mo4281a();
    }

    /* renamed from: d */
    public Object mo4273d() {
        return this.f3350a.mo4282b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f3350a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f3350a);
        }
        if (audioAttributesCompat.f3350a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3350a.hashCode();
    }

    public String toString() {
        return this.f3350a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f3350a = audioAttributesImpl;
    }
}

package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f3352a;

    /* renamed from: b */
    public int f3353b;

    /* renamed from: androidx.media.AudioAttributesImplApi21$a */
    static class C0726a implements AudioAttributesImpl.C0725a {

        /* renamed from: a */
        final AudioAttributes.Builder f3354a = new AudioAttributes.Builder();

        C0726a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4283a(int i) {
            mo4293f(i);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4284b(int i) {
            mo4292e(i);
            return this;
        }

        /* renamed from: d */
        public AudioAttributesImpl mo4286d() {
            return new AudioAttributesImplApi21(this.f3354a.build());
        }

        /* renamed from: e */
        public C0726a mo4292e(int i) {
            this.f3354a.setContentType(i);
            return this;
        }

        /* renamed from: f */
        public C0726a mo4293f(int i) {
            this.f3354a.setLegacyStreamType(i);
            return this;
        }

        /* renamed from: g */
        public C0726a mo4285c(int i) {
            if (i == 16) {
                i = 12;
            }
            this.f3354a.setUsage(i);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f3353b = -1;
    }

    /* renamed from: a */
    public int mo4281a() {
        int i = this.f3353b;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m4308c(false, mo4287c(), mo4288d());
    }

    /* renamed from: b */
    public Object mo4282b() {
        return this.f3352a;
    }

    /* renamed from: c */
    public int mo4287c() {
        return this.f3352a.getFlags();
    }

    /* renamed from: d */
    public int mo4288d() {
        return this.f3352a.getUsage();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f3352a.equals(((AudioAttributesImplApi21) obj).f3352a);
    }

    public int hashCode() {
        return this.f3352a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3352a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f3353b = -1;
        this.f3352a = audioAttributes;
        this.f3353b = i;
    }
}

package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* renamed from: androidx.media.AudioAttributesImplApi26$a */
    static class C0727a extends AudioAttributesImplApi21.C0726a {
        C0727a() {
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4285c(int i) {
            mo4295h(i);
            return this;
        }

        /* renamed from: d */
        public AudioAttributesImpl mo4286d() {
            return new AudioAttributesImplApi26(this.f3354a.build());
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ AudioAttributesImplApi21.C0726a mo4294g(int i) {
            mo4295h(i);
            return this;
        }

        /* renamed from: h */
        public C0727a mo4295h(int i) {
            this.f3354a.setUsage(i);
            return this;
        }
    }

    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}

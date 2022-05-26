package androidx.media;

import androidx.versionedparcelable.C1164b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1164b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3355a = bVar.mo6167p(audioAttributesImplBase.f3355a, 1);
        audioAttributesImplBase.f3356b = bVar.mo6167p(audioAttributesImplBase.f3356b, 2);
        audioAttributesImplBase.f3357c = bVar.mo6167p(audioAttributesImplBase.f3357c, 3);
        audioAttributesImplBase.f3358d = bVar.mo6167p(audioAttributesImplBase.f3358d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1164b bVar) {
        bVar.mo6175x(false, false);
        bVar.mo6147F(audioAttributesImplBase.f3355a, 1);
        bVar.mo6147F(audioAttributesImplBase.f3356b, 2);
        bVar.mo6147F(audioAttributesImplBase.f3357c, 3);
        bVar.mo6147F(audioAttributesImplBase.f3358d, 4);
    }
}

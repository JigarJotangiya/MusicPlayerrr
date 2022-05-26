package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1164b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1164b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3352a = (AudioAttributes) bVar.mo6169r(audioAttributesImplApi21.f3352a, 1);
        audioAttributesImplApi21.f3353b = bVar.mo6167p(audioAttributesImplApi21.f3353b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1164b bVar) {
        bVar.mo6175x(false, false);
        bVar.mo6149H(audioAttributesImplApi21.f3352a, 1);
        bVar.mo6147F(audioAttributesImplApi21.f3353b, 2);
    }
}

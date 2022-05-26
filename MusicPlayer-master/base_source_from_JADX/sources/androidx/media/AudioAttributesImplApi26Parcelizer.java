package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1164b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1164b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3352a = (AudioAttributes) bVar.mo6169r(audioAttributesImplApi26.f3352a, 1);
        audioAttributesImplApi26.f3353b = bVar.mo6167p(audioAttributesImplApi26.f3353b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1164b bVar) {
        bVar.mo6175x(false, false);
        bVar.mo6149H(audioAttributesImplApi26.f3352a, 1);
        bVar.mo6147F(audioAttributesImplApi26.f3353b, 2);
    }
}

package androidx.media;

import androidx.versionedparcelable.C1164b;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1164b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3350a = (AudioAttributesImpl) bVar.mo6173v(audioAttributesCompat.f3350a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1164b bVar) {
        bVar.mo6175x(false, false);
        bVar.mo6154M(audioAttributesCompat.f3350a, 1);
    }
}

package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C1164b;

public class IconCompatParcelizer {
    public static IconCompat read(C1164b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2726a = bVar.mo6167p(iconCompat.f2726a, 1);
        iconCompat.f2728c = bVar.mo6161j(iconCompat.f2728c, 2);
        iconCompat.f2729d = bVar.mo6169r(iconCompat.f2729d, 3);
        iconCompat.f2730e = bVar.mo6167p(iconCompat.f2730e, 4);
        iconCompat.f2731f = bVar.mo6167p(iconCompat.f2731f, 5);
        iconCompat.f2732g = (ColorStateList) bVar.mo6169r(iconCompat.f2732g, 6);
        iconCompat.f2734i = bVar.mo6171t(iconCompat.f2734i, 7);
        iconCompat.f2735j = bVar.mo6171t(iconCompat.f2735j, 8);
        iconCompat.mo3300s();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C1164b bVar) {
        bVar.mo6175x(true, true);
        iconCompat.mo3301t(bVar.mo6157f());
        int i = iconCompat.f2726a;
        if (-1 != i) {
            bVar.mo6147F(i, 1);
        }
        byte[] bArr = iconCompat.f2728c;
        if (bArr != null) {
            bVar.mo6143B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2729d;
        if (parcelable != null) {
            bVar.mo6149H(parcelable, 3);
        }
        int i2 = iconCompat.f2730e;
        if (i2 != 0) {
            bVar.mo6147F(i2, 4);
        }
        int i3 = iconCompat.f2731f;
        if (i3 != 0) {
            bVar.mo6147F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2732g;
        if (colorStateList != null) {
            bVar.mo6149H(colorStateList, 6);
        }
        String str = iconCompat.f2734i;
        if (str != null) {
            bVar.mo6151J(str, 7);
        }
        String str2 = iconCompat.f2735j;
        if (str2 != null) {
            bVar.mo6151J(str2, 8);
        }
    }
}

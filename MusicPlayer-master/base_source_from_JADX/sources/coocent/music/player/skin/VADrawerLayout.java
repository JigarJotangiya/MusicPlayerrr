package coocent.music.player.skin;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import coocent.music.player.skin.p274c.C7108d;
import java.util.HashMap;

public class VADrawerLayout extends DrawerLayout {

    /* renamed from: coocent.music.player.skin.VADrawerLayout$a */
    static /* synthetic */ class C7086a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31361a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31361a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31361a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31361a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31361a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VADrawerLayout.C7086a.<clinit>():void");
        }
    }

    public VADrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap g = C7102b.m40441e().mo27292g();
        generateDefaultLayoutParams.width = -2;
        generateDefaultLayoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = (C7101a) g.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                int i2 = C7086a.f31361a[aVar.ordinal()];
                if (i2 == 3) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                        generateDefaultLayoutParams.width = -1;
                    } else if (attributeValue.startsWith("w")) {
                        generateDefaultLayoutParams.width = -2;
                    } else {
                        generateDefaultLayoutParams.width = C7102b.m40441e().mo27287a(attributeValue);
                    }
                } else if (i2 == 4) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        generateDefaultLayoutParams.width = -1;
                    } else if (attributeValue2.startsWith("w")) {
                        generateDefaultLayoutParams.width = -2;
                    } else {
                        generateDefaultLayoutParams.height = C7102b.m40441e().mo27287a(attributeValue2);
                    }
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                Log.d("setupview", aVar.toString());
                int i2 = C7086a.f31361a[aVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        setId(Math.abs(attributeValue.substring(5).hashCode()));
                    }
                } else if (i2 == 2) {
                    Log.i("litongtest", "设置背景颜色");
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("#")) {
                        setBackgroundColor(C7102b.m40441e().mo27291f(attributeSet.getAttributeValue(i)));
                    } else if (attributeValue2.startsWith("@color/")) {
                        String substring = attributeValue2.substring(7, attributeValue2.length());
                        Log.e("bgcolor", "backgroundString:" + substring);
                        setBackgroundResource(C7108d.m40463a(getContext(), substring));
                    } else if (attributeValue2.startsWith("@drawable/")) {
                        String substring2 = attributeValue2.substring(10);
                        String file = getContext().getFilesDir().toString();
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + "/" + substring2 + ".png")));
                    }
                }
            }
        }
    }
}

package coocent.music.player.skin;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import java.util.HashMap;

public class VAFrameLayout extends FrameLayout {

    /* renamed from: coocent.music.player.skin.VAFrameLayout$a */
    static /* synthetic */ class C7087a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31362a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31362a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_gravity     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginLeft     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31362a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_margin     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VAFrameLayout.C7087a.<clinit>():void");
        }
    }

    public VAFrameLayout(Context context, AttributeSet attributeSet) {
        super(context);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap g = C7102b.m40441e().mo27292g();
        generateDefaultLayoutParams.width = -2;
        generateDefaultLayoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = (C7101a) g.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                int i2 = C7087a.f31362a[aVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("f") || attributeValue.startsWith("m")) {
                        generateDefaultLayoutParams.width = -1;
                    } else if (attributeValue.startsWith("w")) {
                        generateDefaultLayoutParams.width = -2;
                    } else {
                        generateDefaultLayoutParams.width = C7102b.m40441e().mo27287a(attributeValue);
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("f") || attributeValue2.startsWith("m")) {
                        generateDefaultLayoutParams.width = -1;
                    } else if (attributeValue2.startsWith("w")) {
                        generateDefaultLayoutParams.width = -2;
                    } else {
                        generateDefaultLayoutParams.height = C7102b.m40441e().mo27287a(attributeValue2);
                    }
                } else if (i2 == 3) {
                    generateDefaultLayoutParams.gravity = C7102b.m40441e().mo27289c(attributeSet.getAttributeValue(i));
                } else if (i2 == 4) {
                    generateDefaultLayoutParams.leftMargin = C7102b.m40441e().mo27287a(attributeSet.getAttributeValue(i));
                } else if (i2 == 5) {
                    int a = C7102b.m40441e().mo27287a(attributeSet.getAttributeValue(i));
                    generateDefaultLayoutParams.setMargins(a, a, a, a);
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}

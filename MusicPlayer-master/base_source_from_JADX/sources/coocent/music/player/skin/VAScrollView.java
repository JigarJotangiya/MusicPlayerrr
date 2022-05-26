package coocent.music.player.skin;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import java.util.HashMap;

public class VAScrollView extends ScrollView {

    /* renamed from: coocent.music.player.skin.VAScrollView$a */
    static /* synthetic */ class C7096a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31374a;

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
                f31374a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31374a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31374a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.contentDescription     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31374a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.fadingEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31374a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.visibility     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VAScrollView.C7096a.<clinit>():void");
        }
    }

    public VAScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                Log.d("setupview", aVar.toString());
                int i2 = C7096a.f31374a[aVar.ordinal()];
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
                    } else {
                        if (attributeValue2.startsWith("@drawable/")) {
                            attributeValue2 = attributeValue2.substring(10);
                        }
                        String file = getContext().getFilesDir().toString();
                        setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + "/" + attributeValue2 + ".png")));
                    }
                } else if (i2 == 3) {
                    setContentDescription(attributeSet.getAttributeValue(i));
                }
            }
        }
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                int i2 = C7096a.f31374a[aVar.ordinal()];
                if (i2 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                } else if (i2 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}

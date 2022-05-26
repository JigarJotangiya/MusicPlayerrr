package coocent.music.player.skin;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListView;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import java.util.HashMap;

public class VAListView extends ListView {

    /* renamed from: coocent.music.player.skin.VAListView$a */
    static /* synthetic */ class C7091a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31366a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31366a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.fadingEdge     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.visibility     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginTop     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0049 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginLeft     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0054 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginRight     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0060 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginBottom     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x006c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0078 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.divider     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31366a     // Catch:{ NoSuchFieldError -> 0x0084 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.splitMotionEvents     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VAListView.C7091a.<clinit>():void");
        }
    }

    public VAListView(Context context, AttributeSet attributeSet) {
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
                switch (C7091a.f31366a[aVar.ordinal()]) {
                    case 9:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(Math.abs(attributeValue.substring(5).hashCode()));
                            break;
                        }
                    case 10:
                        setDivider(new ColorDrawable(C7102b.m40441e().mo27291f(attributeSet.getAttributeValue(i))));
                        break;
                    case 11:
                        setMotionEventSplittingEnabled(!attributeSet.getAttributeValue(i).equals("false"));
                        break;
                }
            }
        }
    }

    public AbsListView.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) generateDefaultLayoutParams();
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < attributeCount; i5++) {
            C7101a aVar = j.get(attributeSet2.getAttributeName(i5));
            if (aVar != null) {
                switch (C7091a.f31366a[aVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet2.getAttributeValue(i5);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (!attributeValue.startsWith("wrap")) {
                                layoutParams.width = C7102b.m40441e().mo27287a(attributeValue);
                                break;
                            } else {
                                layoutParams.width = -2;
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet2.getAttributeValue(i5);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (!attributeValue2.startsWith("wrap")) {
                                layoutParams.height = C7102b.m40441e().mo27287a(attributeValue2);
                                break;
                            } else {
                                layoutParams.height = -2;
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                    case 3:
                        setHorizontalFadingEdgeEnabled(attributeSet2.getAttributeBooleanValue(i5, false));
                        break;
                    case 4:
                        String attributeValue3 = attributeSet2.getAttributeValue(i5);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            if (!attributeValue3.equals("invisible")) {
                                if (!attributeValue3.equalsIgnoreCase("gone")) {
                                    break;
                                } else {
                                    setVisibility(8);
                                    break;
                                }
                            } else {
                                setVisibility(4);
                                break;
                            }
                        } else {
                            break;
                        }
                    case 5:
                        i2 = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i5));
                        break;
                    case 6:
                        i = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i5));
                        break;
                    case 7:
                        i3 = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i5));
                        break;
                    case 8:
                        i4 = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i5));
                        break;
                }
            }
        }
        setPadding(i, i2, i3, i4);
        return layoutParams;
    }
}

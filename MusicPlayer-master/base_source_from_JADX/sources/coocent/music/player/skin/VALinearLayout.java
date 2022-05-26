package coocent.music.player.skin;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import coocent.music.player.skin.p274c.C7108d;
import java.util.HashMap;
import skin.support.widget.SkinCompatLinearLayout;

public class VALinearLayout extends SkinCompatLinearLayout {

    /* renamed from: coocent.music.player.skin.VALinearLayout$a */
    static /* synthetic */ class C7090a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31365a;

        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|(3:63|64|66)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(66:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|66) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31365a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.orientation     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0049 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_centerHorizontal     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0054 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_centerVertical     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0060 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_weight     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x006c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.gravity     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0078 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.contentDescription     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0084 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_margin     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0090 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginLeft     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x009c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginRight     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginStart     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginEnd     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginTop     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00cc }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginBottom     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_gravity     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_below     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_above     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x00fc }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toLeftOf     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0108 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toRightOf     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0114 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toStartOf     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0120 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toEndOf     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x012c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingLeft     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0138 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingRight     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0144 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingTop     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0150 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingBottom     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x015c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingStart     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0168 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingEnd     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0174 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.padding     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0180 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layoutDirection     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VALinearLayout.C7090a.<clinit>():void");
        }
    }

    public VALinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap g = C7102b.m40441e().mo27292g();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet2.getAttributeName(i);
            C7101a aVar = (C7101a) g.get(attributeName);
            if (aVar != null) {
                switch (C7090a.f31365a[aVar.ordinal()]) {
                    case 4:
                        String attributeValue = attributeSet2.getAttributeValue(i);
                        if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                            if (!attributeValue.startsWith("wrap")) {
                                Log.i("YDLinearLayout", "设置宽度" + generateDefaultLayoutParams.width);
                                generateDefaultLayoutParams.width = C7102b.m40441e().mo27287a(attributeValue);
                                break;
                            } else {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            break;
                        }
                        break;
                    case 5:
                        String attributeValue2 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (!attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = C7102b.m40441e().mo27287a(attributeValue2);
                                break;
                            } else {
                                generateDefaultLayoutParams.height = -2;
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 6:
                        generateDefaultLayoutParams.gravity = 1;
                        break;
                    case 7:
                        generateDefaultLayoutParams.gravity = 16;
                        break;
                    case 8:
                        generateDefaultLayoutParams.weight = attributeSet2.getAttributeFloatValue(i, 0.0f);
                        break;
                    case 9:
                        setGravity(C7102b.m40441e().mo27289c(attributeSet2.getAttributeValue(i)));
                        break;
                    case 10:
                        setContentDescription(attributeSet2.getAttributeValue(i));
                        break;
                    case 11:
                        int a = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        generateDefaultLayoutParams.bottomMargin = a;
                        generateDefaultLayoutParams.leftMargin = a;
                        generateDefaultLayoutParams.rightMargin = a;
                        generateDefaultLayoutParams.topMargin = a;
                        break;
                    case 12:
                        generateDefaultLayoutParams.leftMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 13:
                        generateDefaultLayoutParams.rightMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 14:
                        generateDefaultLayoutParams.setMarginStart(C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i)));
                        break;
                    case 15:
                        generateDefaultLayoutParams.setMarginEnd(C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i)));
                        break;
                    case 16:
                        generateDefaultLayoutParams.topMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 17:
                        generateDefaultLayoutParams.bottomMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 18:
                        generateDefaultLayoutParams.gravity = C7102b.m40441e().mo27289c(attributeSet2.getAttributeValue(i));
                        break;
                    case 19:
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue3 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue3.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(3, Math.abs(attributeValue3.substring(4).hashCode()));
                            setLayoutParams(layoutParams);
                            break;
                        }
                    case 20:
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue4 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue4.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams2.addRule(2, Math.abs(attributeValue4.substring(4).hashCode()));
                            setLayoutParams(layoutParams2);
                            break;
                        }
                    case 21:
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue5 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue5.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams3.addRule(0, Math.abs(attributeValue5.substring(4).hashCode()));
                            setLayoutParams(layoutParams3);
                            break;
                        }
                    case 22:
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue6 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue6.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams4.addRule(1, Math.abs(attributeValue6.substring(4).hashCode()));
                            setLayoutParams(layoutParams4);
                            break;
                        }
                    case 23:
                        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue7 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue7.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams5.addRule(16, Math.abs(attributeValue7.substring(4).hashCode()));
                            setLayoutParams(layoutParams5);
                            break;
                        }
                    case 24:
                        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue8 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue8.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams6.addRule(17, Math.abs(attributeValue8.substring(4).hashCode()));
                            setLayoutParams(layoutParams6);
                            break;
                        }
                    case 25:
                        String attributeValue9 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue9.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(Integer.parseInt(attributeValue9.substring(0, attributeValue9.indexOf("dp"))), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                            break;
                        }
                    case 26:
                        String attributeValue10 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue10.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), getPaddingTop(), Integer.parseInt(attributeValue10.substring(0, attributeValue10.indexOf("dp"))), getPaddingBottom());
                            break;
                        }
                    case 27:
                        String attributeValue11 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue11.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), Integer.parseInt(attributeValue11.substring(0, attributeValue11.indexOf("dp"))), getPaddingRight(), getPaddingBottom());
                            break;
                        }
                    case 28:
                        String attributeValue12 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue12.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), Integer.parseInt(attributeValue12.substring(0, attributeValue12.indexOf("dp"))));
                            break;
                        }
                    case 29:
                        String attributeValue13 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue13.endsWith("dp")) {
                            break;
                        } else {
                            setPaddingRelative(Integer.parseInt(attributeValue13.substring(0, attributeValue13.indexOf("dp"))), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
                            break;
                        }
                    case 30:
                        String attributeValue14 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue14.endsWith("dp")) {
                            break;
                        } else {
                            setPaddingRelative(getPaddingStart(), getPaddingTop(), Integer.parseInt(attributeValue14.substring(0, attributeValue14.indexOf("dp"))), getPaddingBottom());
                            break;
                        }
                    case 31:
                        try {
                            String attributeValue15 = attributeSet2.getAttributeValue(i);
                            if (!attributeValue15.endsWith("dp")) {
                                break;
                            } else {
                                int parseInt = Integer.parseInt(attributeValue15.substring(0, attributeValue15.indexOf("dp")));
                                setPadding(parseInt, parseInt, parseInt, parseInt);
                                break;
                            }
                        } catch (Exception unused) {
                            break;
                        }
                    case 32:
                        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(generateDefaultLayoutParams.width, generateDefaultLayoutParams.height);
                        String attributeValue16 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue16.equals("rtl")) {
                            if (!attributeValue16.equals("ltr")) {
                                break;
                            } else {
                                layoutParams7.setLayoutDirection(0);
                                setLayoutParams(layoutParams7);
                                break;
                            }
                        } else {
                            layoutParams7.setLayoutDirection(1);
                            setLayoutParams(layoutParams7);
                            break;
                        }
                    default:
                        Log.e("YDLinearLayout", "未处理的属性:" + attributeName);
                        break;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                Log.d("setupview", aVar.toString());
                int i2 = C7090a.f31365a[aVar.ordinal()];
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
                } else if (i2 == 3) {
                    if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                        setOrientation(0);
                        Log.i("YDLinearLayout", "设置了水平的布局");
                    } else {
                        setOrientation(1);
                    }
                }
            }
        }
    }
}

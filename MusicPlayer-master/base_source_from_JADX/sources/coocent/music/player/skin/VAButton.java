package coocent.music.player.skin;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import coocent.music.player.skin.p274c.C7108d;
import java.util.HashMap;
import p443m.p444a.p447e.p448a.C9332d;

public class VAButton extends Button {

    /* renamed from: coocent.music.player.skin.VAButton$a */
    static /* synthetic */ class C7084a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31359a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31359a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.text     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.ellipsize     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.fadingEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.scrollHorizontally     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0049 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.textColor     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0054 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.textSize     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0060 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.visibility     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x006c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0078 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.textStyle     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0084 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.style     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x0090 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.src     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x009c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.contentDescription     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f31359a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.gravity     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VAButton.C7084a.<clinit>():void");
        }
    }

    public VAButton(Context context, AttributeSet attributeSet) {
        super(context);
        mo27233a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo27233a(Context context, AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                switch (C7084a.f31359a[aVar.ordinal()]) {
                    case 1:
                        setTag(attributeSet.getAttributeValue(i));
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(Math.abs(attributeValue.substring(5).hashCode()));
                            break;
                        }
                    case 2:
                        setText(C7102b.m40441e().mo27293h(context, attributeSet.getAttributeValue(i)));
                        break;
                    case 3:
                        if (!attributeSet.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            setFocusable(true);
                            setFocusableInTouchMode(true);
                            setSingleLine(true);
                            setEllipsize(TextUtils.TruncateAt.MARQUEE);
                            setMarqueeRepeatLimit(1000);
                            setSingleLine();
                            setHorizontallyScrolling(true);
                            requestFocus();
                            break;
                        }
                    case 4:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                        break;
                    case 5:
                        setHorizontallyScrolling(attributeSet.getAttributeBooleanValue(i, false));
                        break;
                    case 6:
                        setTextColor(C7102b.m40441e().mo27291f(attributeSet.getAttributeValue(i)));
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        int a = C7108d.m40463a(getContext(), attributeValue2.substring(7, attributeValue2.length()));
                        if (a <= 0) {
                            break;
                        } else {
                            setTextColor(C9332d.m49405b(context, a));
                            break;
                        }
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            setTextSize((float) C7102b.m40441e().mo27287a(attributeValue3));
                            break;
                        }
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            if (!attributeValue4.equals("invisible")) {
                                if (!attributeValue4.equalsIgnoreCase("gone")) {
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
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!attributeValue5.startsWith("#")) {
                            if (attributeValue5.startsWith("@drawable/")) {
                                attributeValue5 = attributeValue5.substring(10);
                            }
                            String file = getContext().getFilesDir().toString();
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + "/" + attributeValue5 + ".png")));
                            break;
                        } else {
                            setBackgroundColor(C7102b.m40441e().mo27291f(attributeSet.getAttributeValue(i)));
                            break;
                        }
                    case 10:
                        if (!"bold".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                            break;
                        } else {
                            setTypeface(Typeface.defaultFromStyle(1));
                            break;
                        }
                    case 11:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        String substring = attributeValue6.substring(attributeValue6.indexOf("/") + 1);
                        Log.i("button", "设置属性值");
                        C7102b e = C7102b.m40441e();
                        setTextAppearance(getContext(), e.mo27290d("R.style." + substring));
                        break;
                    case 13:
                        setContentDescription(attributeSet.getAttributeValue(i));
                        break;
                    case 14:
                        setGravity(1);
                        break;
                }
            }
        }
    }
}

package coocent.music.player.skin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import coocent.music.player.base.BaseApplication;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import java.util.HashMap;
import skin.support.widget.SkinCompatImageView;

public class VACirleImageView extends SkinCompatImageView {

    /* renamed from: coocent.music.player.skin.VACirleImageView$a */
    static /* synthetic */ class C7085a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31360a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31360a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.src     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x0049 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.contentDescription     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31360a     // Catch:{ NoSuchFieldError -> 0x0054 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.scaleType     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VACirleImageView.C7085a.<clinit>():void");
        }
    }

    public VACirleImageView(Context context, AttributeSet attributeSet) {
        super(context);
        mo27234d(context, attributeSet);
    }

    /* renamed from: d */
    public void mo27234d(Context context, AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(0, 0);
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                switch (C7085a.f31360a[aVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(Math.abs(attributeValue.substring(5).hashCode()));
                            break;
                        }
                    case 2:
                        C7102b.m40441e().mo27288b(context, attributeSet.getAttributeValue(i), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
                            if (!attributeValue2.startsWith("w")) {
                                layoutParams.width = C7102b.m40441e().mo27287a(attributeValue2);
                                break;
                            } else {
                                layoutParams.width = -2;
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!attributeValue3.startsWith("fill") && !attributeValue3.startsWith("match")) {
                            if (!attributeValue3.startsWith("wrap")) {
                                layoutParams.height = C7102b.m40441e().mo27287a(attributeValue3);
                                break;
                            } else {
                                layoutParams.height = -2;
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!attributeValue4.startsWith("#")) {
                            if (!attributeValue4.startsWith("@drawable/")) {
                                if (!attributeValue4.equals("?attr/selectableItemBackgroundBorderless")) {
                                    if (attributeValue4.equals("?attr/selectableItemBackground") && BaseApplication.f31159w) {
                                        TypedValue typedValue = new TypedValue();
                                        context.getTheme().resolveAttribute(16843534, typedValue, true);
                                        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.resourceId, new int[]{16843534});
                                        Drawable drawable = obtainStyledAttributes.getDrawable(0);
                                        obtainStyledAttributes.recycle();
                                        setBackground(drawable);
                                        break;
                                    }
                                } else if (!BaseApplication.f31159w) {
                                    break;
                                } else {
                                    TypedValue typedValue2 = new TypedValue();
                                    context.getTheme().resolveAttribute(16843868, typedValue2, true);
                                    TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(typedValue2.resourceId, new int[]{16843868});
                                    Drawable drawable2 = obtainStyledAttributes2.getDrawable(0);
                                    obtainStyledAttributes2.recycle();
                                    setBackground(drawable2);
                                    break;
                                }
                            } else {
                                String substring = attributeValue4.substring(10);
                                String file = getContext().getFilesDir().toString();
                                setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + "/" + substring + ".png")));
                                break;
                            }
                        } else {
                            setBackgroundColor(C7102b.m40441e().mo27291f(attributeSet.getAttributeValue(i)));
                            break;
                        }
                    case 6:
                        setContentDescription(attributeSet.getAttributeValue(i));
                        break;
                    case 7:
                        if (!attributeSet.getAttributeValue(i).equals("centerCrop")) {
                            break;
                        } else {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(ImageView.getDefaultSize(0, i), ImageView.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}

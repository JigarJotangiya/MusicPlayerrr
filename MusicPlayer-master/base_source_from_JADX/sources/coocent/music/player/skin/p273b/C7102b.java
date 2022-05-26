package coocent.music.player.skin.p273b;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.widget.ImageView;
import coocent.music.player.skin.p274c.C7104b;
import coocent.music.player.skin.p274c.C7108d;
import coocent.music.player.skin.p274c.C7110f;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: coocent.music.player.skin.b.b */
/* compiled from: YDResource */
public class C7102b {

    /* renamed from: e */
    private static C7102b f31380e;

    /* renamed from: a */
    private SoftReference<HashMap<String, C7101a>> f31381a;

    /* renamed from: b */
    private SoftReference<HashMap<String, String>> f31382b;

    /* renamed from: c */
    private SoftReference<HashMap<String, C7101a>> f31383c;

    /* renamed from: d */
    private String f31384d;

    private C7102b() {
    }

    /* renamed from: e */
    public static C7102b m40441e() {
        if (f31380e == null) {
            f31380e = new C7102b();
        }
        return f31380e;
    }

    /* renamed from: l */
    private HashMap<String, String> m40442l(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("strings.xml");
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(inputStream, "utf-8");
            HashMap<String, String> hashMap = new HashMap<>();
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2 && "string".equals(newPullParser.getName())) {
                    hashMap.put(newPullParser.getAttributeValue(0), newPullParser.nextText());
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public int mo27287a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int indexOf = str.indexOf("d");
            int indexOf2 = str.indexOf("s");
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            Log.i("YDResource", "计算后的值为" + parseInt);
            return parseInt;
        }
    }

    /* renamed from: b */
    public void mo27288b(Context context, String str, ImageView imageView) {
        if (str.startsWith("@drawable/")) {
            imageView.setImageDrawable(C9332d.m49407d(context, context.getResources().getIdentifier(str, "drawable", context.getPackageName())));
        } else {
            imageView.setImageBitmap(BitmapFactory.decodeFile(new StringBuilder(str).toString()));
        }
    }

    /* renamed from: c */
    public int mo27289c(String str) {
        Log.i("YDResource gravity", str);
        str.toUpperCase().split("\\|");
        if (str.equals("center_vertical")) {
            return 16;
        }
        if (str.equals("center")) {
            return 17;
        }
        if (str.equals("center_horizontal")) {
            return 1;
        }
        if (str.equals("left")) {
            return 3;
        }
        if (str.equals("right")) {
            return 5;
        }
        if (!str.equals("top") && str.equals("bottom")) {
            return 80;
        }
        return 48;
    }

    /* renamed from: d */
    public int mo27290d(String str) {
        String packageName = C8345u.m46327h().getPackageName();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(".R$");
        String[] split = str.split("\\.");
        System.out.println(split.toString());
        sb.append(split[1]);
        int i = 0;
        try {
            Class<?> cls = Class.forName(sb.toString());
            Object newInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(split[2]);
            declaredField.setAccessible(true);
            i = ((Integer) declaredField.get(newInstance)).intValue();
            Log.i("YDResource", "id :" + i);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: f */
    public int mo27291f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.startsWith("#")) {
            int length = str.length();
            if (length == 7) {
                return (int) Long.decode(str.replace("#", "#FF")).longValue();
            }
            if (length == 9) {
                return (int) Long.decode(str).longValue();
            }
            C7110f.m40467a("返回白色背景");
            return -1;
        } else if (!str.startsWith("@color/")) {
            return -16777216;
        } else {
            String substring = str.substring(7, str.length());
            Log.e("bgcolor", "backgroundString:" + substring);
            return C8345u.m46327h().getResources().getColor(C7108d.m40463a(C8345u.m46327h(), substring));
        }
    }

    /* renamed from: g */
    public HashMap mo27292g() {
        SoftReference<HashMap<String, C7101a>> softReference = this.f31381a;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("layout_width", C7101a.layout_width);
            hashMap.put("layout_height", C7101a.layout_height);
            hashMap.put("orientation", C7101a.orientation);
            hashMap.put("layout_centerHorizontal", C7101a.layout_centerHorizontal);
            hashMap.put("layout_centerVertical", C7101a.layout_centerVertical);
            C7101a aVar = C7101a.layout_marginLeft;
            hashMap.put("layout_marginLeft", aVar);
            C7101a aVar2 = C7101a.layout_marginRight;
            hashMap.put("layout_marginRight", aVar2);
            C7101a aVar3 = C7101a.layout_marginStart;
            hashMap.put("layout_marginStart", aVar3);
            C7101a aVar4 = C7101a.layout_marginEnd;
            hashMap.put("layout_marginEnd", aVar4);
            hashMap.put("layout_margin", C7101a.layout_margin);
            hashMap.put("layout_gravity", C7101a.layout_gravity);
            hashMap.put("layout_alignParentRight", C7101a.layout_alignParentRight);
            hashMap.put("layout_alignParentEnd", C7101a.layout_alignParentEnd);
            hashMap.put("layout_alignParentBottom", C7101a.layout_alignParentBottom);
            hashMap.put("layoutDirection", C7101a.layoutDirection);
            hashMap.put("layout_weight", C7101a.layout_weight);
            hashMap.put("contentDescription", C7101a.contentDescription);
            hashMap.put("gravity", C7101a.gravity);
            hashMap.put("id", C7101a.id);
            hashMap.put("layout_below", C7101a.layout_below);
            hashMap.put("layout_above", C7101a.layout_above);
            hashMap.put("layout_toLeftOf", C7101a.layout_toLeftOf);
            hashMap.put("layout_toRightOf", C7101a.layout_toRightOf);
            hashMap.put("layout_toStartOf", C7101a.layout_toStartOf);
            hashMap.put("layout_toEndOf", C7101a.layout_toEndOf);
            hashMap.put("background", C7101a.background);
            hashMap.put("layout_marginTop", C7101a.layout_marginTop);
            hashMap.put("layout_marginBottom", C7101a.layout_marginBottom);
            hashMap.put("layout_marginLeft", aVar);
            hashMap.put("layout_marginRight", aVar2);
            hashMap.put("layout_marginStart", aVar3);
            hashMap.put("layout_marginEnd", aVar4);
            hashMap.put("layout_alignTop", C7101a.layout_alignTop);
            hashMap.put("layout_alignBottom", C7101a.layout_alignBottom);
            hashMap.put("layout_alignLeft", C7101a.layout_alignLeft);
            hashMap.put("layout_alignRight", C7101a.layout_alignRight);
            hashMap.put("layout_alignStart", C7101a.layout_alignStart);
            hashMap.put("layout_alignEnd", C7101a.layout_alignEnd);
            hashMap.put("paddingLeft", C7101a.paddingLeft);
            hashMap.put("paddingRight", C7101a.paddingRight);
            hashMap.put("paddingTop", C7101a.paddingTop);
            hashMap.put("paddingBottom", C7101a.paddingBottom);
            hashMap.put("paddingStart", C7101a.paddingStart);
            hashMap.put("paddingEnd", C7101a.paddingEnd);
            hashMap.put("padding", C7101a.padding);
            hashMap.put("visibility", C7101a.visibility);
            this.f31381a = new SoftReference<>(hashMap);
        }
        return this.f31381a.get();
    }

    /* renamed from: h */
    public String mo27293h(Context context, String str) {
        if (!str.startsWith("@")) {
            return str;
        }
        SoftReference<HashMap<String, String>> softReference = this.f31382b;
        if (softReference == null || softReference.get() == null) {
            C7110f.m40467a("字符串变空了");
            this.f31382b = new SoftReference<>(m40442l(context));
        }
        return (String) this.f31382b.get().get(str.substring(8));
    }

    /* renamed from: i */
    public int mo27294i(Context context, String str) {
        if (!str.startsWith("@")) {
            return -1;
        }
        SoftReference<HashMap<String, String>> softReference = this.f31382b;
        if (softReference == null || softReference.get() == null) {
            C7110f.m40467a("字符串变空了");
            this.f31382b = new SoftReference<>(m40442l(context));
        }
        return C7108d.m40465c(context, str.substring(8));
    }

    /* renamed from: j */
    public HashMap<String, C7101a> mo27295j() {
        SoftReference<HashMap<String, C7101a>> softReference = this.f31383c;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", C7101a.id);
            hashMap.put("text", C7101a.text);
            hashMap.put("ellipsize", C7101a.ellipsize);
            hashMap.put("fadingEdge", C7101a.fadingEdge);
            hashMap.put("scrollHorizontally", C7101a.scrollHorizontally);
            hashMap.put("textColor", C7101a.textColor);
            hashMap.put("textSize", C7101a.textSize);
            hashMap.put("visibility", C7101a.visibility);
            C7101a aVar = C7101a.background;
            hashMap.put("background", aVar);
            hashMap.put("textStyle", C7101a.textStyle);
            hashMap.put("style", C7101a.style);
            hashMap.put("layout_width", C7101a.layout_width);
            hashMap.put("layout_height", C7101a.layout_height);
            hashMap.put("layout_below", C7101a.layout_below);
            hashMap.put("contentDescription", C7101a.contentDescription);
            hashMap.put("src", C7101a.src);
            hashMap.put("gravity", C7101a.gravity);
            hashMap.put("orientation", C7101a.orientation);
            hashMap.put("numColumns", C7101a.numColumns);
            hashMap.put("verticalSpacing", C7101a.verticalSpacing);
            hashMap.put("horizontalSpacing", C7101a.horizontalSpacing);
            hashMap.put("background", aVar);
            hashMap.put("scaleType", C7101a.scaleType);
            hashMap.put("layout_alignTop", C7101a.layout_alignTop);
            hashMap.put("layout_alignBottom", C7101a.layout_alignBottom);
            hashMap.put("layout_alignLeft", C7101a.layout_alignLeft);
            hashMap.put("layout_alignRight", C7101a.layout_alignRight);
            hashMap.put("layout_alignStart", C7101a.layout_alignStart);
            hashMap.put("layout_alignEnd", C7101a.layout_alignEnd);
            hashMap.put("paddingLeft", C7101a.paddingLeft);
            hashMap.put("paddingRight", C7101a.paddingRight);
            hashMap.put("paddingTop", C7101a.paddingTop);
            hashMap.put("paddingBottom", C7101a.paddingBottom);
            hashMap.put("paddingStart", C7101a.paddingStart);
            hashMap.put("paddingEnd", C7101a.paddingEnd);
            hashMap.put("padding", C7101a.padding);
            hashMap.put("layoutDirection", C7101a.layoutDirection);
            this.f31383c = new SoftReference<>(hashMap);
        }
        return this.f31383c.get();
    }

    /* renamed from: k */
    public void mo27296k(Context context, String str) {
        if (C7110f.f31389a) {
            context.getFilesDir().toString();
        }
        if (C7104b.m40455a(context).heightPixels <= 320) {
            this.f31384d = "/drawable-mdpi/";
        } else if (C7110f.f31389a) {
            this.f31384d = "/drawable-mdpi/";
        } else {
            this.f31384d = "/drawable-hdpi/";
        }
        C7110f.m40467a("屏幕：" + this.f31384d);
    }
}

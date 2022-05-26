package net.coocent.android.xmlparser.gift;

import android.content.Context;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import p391j.p392a.p393a.C8609b;

public class GiftConfig implements Parcelable {
    public static final Parcelable.Creator<GiftConfig> CREATOR = new C9431a();

    /* renamed from: g */
    private int f36345g;

    /* renamed from: h */
    private int f36346h;

    /* renamed from: i */
    private int f36347i;

    /* renamed from: j */
    private int f36348j;

    /* renamed from: k */
    private int f36349k;

    /* renamed from: net.coocent.android.xmlparser.gift.GiftConfig$a */
    class C9431a implements Parcelable.Creator<GiftConfig> {
        C9431a() {
        }

        /* renamed from: a */
        public GiftConfig createFromParcel(Parcel parcel) {
            return new GiftConfig(parcel);
        }

        /* renamed from: b */
        public GiftConfig[] newArray(int i) {
            return new GiftConfig[i];
        }
    }

    /* renamed from: net.coocent.android.xmlparser.gift.GiftConfig$b */
    public static class C9432b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f36350a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f36351b = Color.parseColor("#F5F5F5");
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f36352c = -1;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f36353d = Color.parseColor("#000000");
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f36354e = Color.parseColor("#585858");

        /* renamed from: f */
        public GiftConfig mo32556f() {
            return new GiftConfig(this, (C9431a) null);
        }
    }

    /* synthetic */ GiftConfig(C9432b bVar, C9431a aVar) {
        this(bVar);
    }

    /* renamed from: b */
    public static Map<String, String> m49720b(Context context) {
        String[] stringArray = context.getResources().getStringArray(C8609b.gift_desc_key);
        String[] stringArray2 = context.getResources().getStringArray(C8609b.gift_desc_value);
        int min = Math.min(stringArray.length, stringArray2.length);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < min; i++) {
            hashMap.put(stringArray[i], stringArray2[i]);
        }
        return hashMap;
    }

    /* renamed from: d */
    public static Map<String, String> m49721d(Context context) {
        String[] stringArray = context.getResources().getStringArray(C8609b.gift_title_key);
        String[] stringArray2 = context.getResources().getStringArray(C8609b.gift_title_value);
        int min = Math.min(stringArray.length, stringArray2.length);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < min; i++) {
            hashMap.put(stringArray[i], stringArray2[i]);
        }
        return hashMap;
    }

    /* renamed from: g */
    public static void m49722g(TextView textView, Map<String, String> map, String str, String str2) {
        if (textView != null) {
            if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setContentDescription(str);
                return;
            }
            String str3 = map.get(str);
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
            textView.setText(str2);
            textView.setContentDescription(str2);
        }
    }

    /* renamed from: h */
    public static void m49723h(TextView textView, Map<String, String> map, String str, String str2) {
        if (textView != null) {
            if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setContentDescription(str);
                return;
            }
            String str3 = map.get(str);
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
            textView.setText(str2);
            textView.setContentDescription(str2);
        }
    }

    /* renamed from: a */
    public int mo32547a() {
        return this.f36347i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo32549e() {
        return this.f36345g;
    }

    /* renamed from: f */
    public int mo32550f() {
        return this.f36346h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36345g);
        parcel.writeInt(this.f36346h);
        parcel.writeInt(this.f36347i);
        parcel.writeInt(this.f36348j);
        parcel.writeInt(this.f36349k);
    }

    private GiftConfig(C9432b bVar) {
        this.f36345g = bVar.f36350a;
        this.f36346h = bVar.f36351b;
        this.f36347i = bVar.f36352c;
        this.f36348j = bVar.f36353d;
        this.f36349k = bVar.f36354e;
    }

    protected GiftConfig(Parcel parcel) {
        this.f36345g = parcel.readInt();
        this.f36346h = parcel.readInt();
        this.f36347i = parcel.readInt();
        this.f36348j = parcel.readInt();
        this.f36349k = parcel.readInt();
    }
}

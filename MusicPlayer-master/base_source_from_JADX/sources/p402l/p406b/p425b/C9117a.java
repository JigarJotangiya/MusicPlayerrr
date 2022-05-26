package p402l.p406b.p425b;

import java.util.HashMap;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.b.a */
/* compiled from: AbstractTagDisplayFormatter */
public abstract class C9117a {

    /* renamed from: a */
    private static HashMap<String, String> f35724a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f35724a = hashMap;
        hashMap.put("0", "0000");
        f35724a.put("1", "0001");
        f35724a.put("2", "0010");
        f35724a.put("3", "0011");
        f35724a.put("4", "0100");
        f35724a.put("5", "0101");
        f35724a.put("6", "0110");
        f35724a.put("7", "0111");
        f35724a.put("8", "1000");
        f35724a.put("9", "1001");
        f35724a.put("a", "1010");
        f35724a.put("b", "1011");
        f35724a.put("c", "1100");
        f35724a.put("d", "1101");
        f35724a.put("e", "1110");
        f35724a.put("f", "1111");
    }

    /* renamed from: a */
    public static String m48552a(byte b) {
        String str;
        String str2;
        String substring;
        String str3 = BuildConfig.FLAVOR;
        String hexString = Integer.toHexString(b);
        try {
            if (hexString.length() == 8) {
                str2 = hexString.substring(6, 7);
                substring = hexString.substring(7, 8);
            } else if (hexString.length() == 2) {
                str2 = hexString.substring(0, 1);
                substring = hexString.substring(1, 2);
            } else if (hexString.length() == 1) {
                str2 = "0";
                substring = hexString.substring(0, 1);
            } else {
                str = str3;
                return f35724a.get(str3) + f35724a.get(str);
            }
            str = substring;
            str3 = str2;
            return f35724a.get(str3) + f35724a.get(str);
        } catch (StringIndexOutOfBoundsException unused) {
            return str3;
        }
    }
}

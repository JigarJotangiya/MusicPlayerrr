package coocent.music.player.skin;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import coocent.music.player.skin.p273b.C7101a;
import coocent.music.player.skin.p273b.C7102b;
import coocent.music.player.skin.p274c.C7108d;
import java.util.HashMap;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class VARelativeLayout extends RelativeLayout {

    /* renamed from: coocent.music.player.skin.VARelativeLayout$a */
    static /* synthetic */ class C7095a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31373a;

        /* JADX WARNING: Can't wrap try/catch for region: R(78:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|(3:77|78|80)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|80) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                coocent.music.player.skin.b.a[] r0 = coocent.music.player.skin.p273b.C7101a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31373a = r0
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.id     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x001d }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.background     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0028 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.gravity     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0033 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_width     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x003e }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_height     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0049 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_centerHorizontal     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0054 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_centerVertical     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0060 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_below     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x006c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_above     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0078 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toLeftOf     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0084 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toRightOf     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0090 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toStartOf     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x009c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_toEndOf     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignLeft     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignRight     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignStart     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00cc }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignEnd     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignTop     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignBottom     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginLeft     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x00fc }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginRight     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0108 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginStart     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0114 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginEnd     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0120 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginTop     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x012c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_marginBottom     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0138 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_margin     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0144 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignParentRight     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0150 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignParentEnd     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x015c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layout_alignParentBottom     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0168 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.contentDescription     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0174 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingLeft     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0180 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingRight     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x018c }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingTop     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x0198 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingBottom     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x01a4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingStart     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x01b0 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.paddingEnd     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x01bc }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.padding     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x01c8 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.layoutDirection     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = f31373a     // Catch:{ NoSuchFieldError -> 0x01d4 }
                coocent.music.player.skin.b.a r1 = coocent.music.player.skin.p273b.C7101a.visibility     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.skin.VARelativeLayout.C7095a.<clinit>():void");
        }
    }

    public VARelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt instanceof VALinearLayout) {
                VALinearLayout vALinearLayout = (VALinearLayout) childAt;
                for (int i6 = 0; i6 < vALinearLayout.getChildCount(); i6++) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) vALinearLayout.getChildAt(i6).getLayoutParams();
                }
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, C7101a> j = C7102b.m40441e().mo27295j();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = j.get(attributeSet.getAttributeName(i));
            if (aVar != null) {
                Log.d("setupview", aVar.toString());
                int i2 = C7095a.f31373a[aVar.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith("@+id/")) {
                        int hashCode = attributeValue.substring(5).hashCode();
                        Log.e("hashCode", "viewId:" + attributeValue + ",hashCode:" + hashCode);
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
                        try {
                            setBackground(C9332d.m49407d(C8345u.m46327h(), C7108d.m40464b(C8345u.m46327h(), attributeValue2)));
                        } catch (Exception unused) {
                        }
                    }
                } else if (i2 == 3) {
                    setGravity(C7102b.m40441e().mo27289c(attributeSet.getAttributeValue(i)));
                }
            }
        }
    }

    public VARelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
    }

    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap g = C7102b.m40441e().mo27292g();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            C7101a aVar = (C7101a) g.get(attributeSet2.getAttributeName(i));
            if (aVar != null) {
                switch (C7095a.f31373a[aVar.ordinal()]) {
                    case 4:
                        String attributeValue = attributeSet2.getAttributeValue(i);
                        if (!attributeValue.startsWith("fill") && !attributeValue.startsWith("match")) {
                            if (!attributeValue.startsWith("w")) {
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
                    case 5:
                        String attributeValue2 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue2.startsWith("fill") && !attributeValue2.startsWith("match")) {
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
                        break;
                    case 6:
                        if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(14, -1);
                            break;
                        }
                    case 7:
                        if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(15, -1);
                            break;
                        }
                    case 8:
                        String attributeValue3 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue3.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(3, Math.abs(attributeValue3.substring(4).hashCode()));
                            break;
                        }
                    case 9:
                        String attributeValue4 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue4.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(2, Math.abs(attributeValue4.substring(4).hashCode()));
                            break;
                        }
                    case 10:
                        String attributeValue5 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue5.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(0, Math.abs(attributeValue5.substring(4).hashCode()));
                            break;
                        }
                    case 11:
                        String attributeValue6 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue6.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(1, Math.abs(attributeValue6.substring(4).hashCode()));
                            break;
                        }
                    case 12:
                        String attributeValue7 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue7.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(16, Math.abs(attributeValue7.substring(4).hashCode()));
                            break;
                        }
                    case 13:
                        String attributeValue8 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue8.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(17, Math.abs(attributeValue8.substring(4).hashCode()));
                            break;
                        }
                    case 14:
                        String attributeValue9 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue9.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(5, Math.abs(attributeValue9.substring(4).hashCode()));
                            break;
                        }
                    case 15:
                        String attributeValue10 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue10.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(7, Math.abs(attributeValue10.substring(4).hashCode()));
                            break;
                        }
                    case 16:
                        String attributeValue11 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue11.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(18, Math.abs(attributeValue11.substring(4).hashCode()));
                            break;
                        }
                    case 17:
                        String attributeValue12 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue12.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(19, Math.abs(attributeValue12.substring(4).hashCode()));
                            break;
                        }
                    case 18:
                        String attributeValue13 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue13.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(6, Math.abs(attributeValue13.substring(4).hashCode()));
                            break;
                        }
                    case 19:
                        String attributeValue14 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue14.startsWith("@id")) {
                            break;
                        } else {
                            layoutParams.addRule(8, Math.abs(attributeValue14.substring(4).hashCode()));
                            break;
                        }
                    case 20:
                        layoutParams.leftMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 21:
                        layoutParams.rightMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 22:
                        layoutParams.setMarginStart(C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i)));
                        break;
                    case 23:
                        layoutParams.setMarginEnd(C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i)));
                        break;
                    case 24:
                        layoutParams.topMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 25:
                        layoutParams.bottomMargin = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        break;
                    case 26:
                        int a = C7102b.m40441e().mo27287a(attributeSet2.getAttributeValue(i));
                        layoutParams.bottomMargin = a;
                        layoutParams.leftMargin = a;
                        layoutParams.rightMargin = a;
                        layoutParams.topMargin = a;
                        break;
                    case 27:
                        if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(11, -1);
                            break;
                        }
                    case 28:
                        if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(21, -1);
                            break;
                        }
                    case 29:
                        if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                            break;
                        } else {
                            layoutParams.addRule(12, -1);
                            break;
                        }
                    case 30:
                        setContentDescription(attributeSet2.getAttributeValue(i));
                        break;
                    case 31:
                        String attributeValue15 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue15.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(Integer.parseInt(attributeValue15.substring(0, attributeValue15.indexOf("dp"))), getPaddingTop(), getPaddingRight(), getPaddingBottom());
                            break;
                        }
                    case 32:
                        String attributeValue16 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue16.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), getPaddingTop(), Integer.parseInt(attributeValue16.substring(0, attributeValue16.indexOf("dp"))), getPaddingBottom());
                            break;
                        }
                    case 33:
                        String attributeValue17 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue17.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), Integer.parseInt(attributeValue17.substring(0, attributeValue17.indexOf("dp"))), getPaddingRight(), getPaddingBottom());
                            break;
                        }
                    case 34:
                        String attributeValue18 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue18.endsWith("dp")) {
                            break;
                        } else {
                            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), Integer.parseInt(attributeValue18.substring(0, attributeValue18.indexOf("dp"))));
                            break;
                        }
                    case 35:
                        String attributeValue19 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue19.endsWith("dp")) {
                            break;
                        } else {
                            setPaddingRelative(Integer.parseInt(attributeValue19.substring(0, attributeValue19.indexOf("dp"))), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
                            break;
                        }
                    case 36:
                        String attributeValue20 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue20.endsWith("dp")) {
                            break;
                        } else {
                            setPaddingRelative(getPaddingStart(), getPaddingTop(), Integer.parseInt(attributeValue20.substring(0, attributeValue20.indexOf("dp"))), getPaddingBottom());
                            break;
                        }
                    case 37:
                        try {
                            String attributeValue21 = attributeSet2.getAttributeValue(i);
                            if (!attributeValue21.endsWith("dp")) {
                                break;
                            } else {
                                int parseInt = Integer.parseInt(attributeValue21.substring(0, attributeValue21.indexOf("dp")));
                                setPadding(parseInt, parseInt, parseInt, parseInt);
                                break;
                            }
                        } catch (Exception unused) {
                            break;
                        }
                    case 38:
                        String attributeValue22 = attributeSet2.getAttributeValue(i);
                        if (!attributeValue22.equals("rtl")) {
                            if (!attributeValue22.equals("ltr")) {
                                break;
                            } else {
                                layoutParams.setLayoutDirection(0);
                                break;
                            }
                        } else {
                            layoutParams.setLayoutDirection(1);
                            break;
                        }
                    case 39:
                        String attributeValue23 = attributeSet2.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue23)) {
                            if (!attributeValue23.equals("invisible")) {
                                if (!attributeValue23.equalsIgnoreCase("gone")) {
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
                }
            }
        }
        return layoutParams;
    }

    public VARelativeLayout(Context context) {
        super(context);
    }
}

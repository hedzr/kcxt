# kcxt

[![Build Status](https://travis-ci.com/hedzr/kcxt.svg?branch=master)](https://travis-ci.com/hedzr/kcxt)
[![JitPack Release](https://jitpack.io/v/hedzr/kcxt.svg)](https://jitpack.io/#hedzr/kcxt)

`kcxt` is a kotlin context-awareness android library. It is a helper for android library composer especially. Composers could get `Application`, `ApplicationContext`, `Context`, and top of `Activity`, at anywhere, at any time. Forget `.setContext(context)`, or `.withContext(MainActivity.this)`.

To use it, just import it from [kcxt at JitPack.io](https://jitpack.io/#hedzr/kcxt), and get android `Application` object by `appGlobal`, or get the current android `Activity` object by `currentActivity`:

```kotlin
import com.obsez.android.libs.kcxt.appGlobal
import com.obsez.android.libs.kcxt.currentActivity
```

>`kcxt` need AndroidX and `ActivityLifecycle` supports.



#### import `kcxt`

```gradle
dependencies {
	// implementation "com.github.hedzr:kcxt:v1.3.12"
	implementation "com.github.hedzr:kcxt:$kcxt_version"
}
```

See the badge above for the newest `kcxt_version` .



## LICENSE

Standard Apache 2.0.


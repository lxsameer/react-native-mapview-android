# react-native-mapview-android
Simple React Native Android module to use Android's mapview inside your app.
This module will be useful until the official RN support aren't released.

### Installation

```bash
npm install react-native-mapview-android --save
```

### Add it to your android project

* In `android/setting.gradle`

```gradle
...
include ':MapView', ':app'
project(':MapView').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-mapview-android')
```

* In `android/app/build.gradle`

```gradle
...
dependencies {
    ...
    compile project(':MapView')
}
```

* Register Module (in MainActivity.java)

```java
import com.lxsameer.mapview.MapView;  // <--- import

public class MainActivity extends Activity implements DefaultHardwareBackBtnHandler {
  ......

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mReactRootView = new ReactRootView(this);

    mReactInstanceManager = ReactInstanceManager.builder()
      .setApplication(getApplication())
      .setBundleAssetName("index.android.bundle")
      .setJSMainModuleName("index.android")
      .addPackage(new MainReactPackage())
      .addPackage(new MapViewPackage()) // <------ add this line to yout MainActivity class
      .setUseDeveloperSupport(BuildConfig.DEBUG)
      .setInitialLifecycleState(LifecycleState.RESUMED)
      .build();

    mReactRootView.startReactApplication(mReactInstanceManager, "AndroidRNSample", null);

    setContentView(mReactRootView);
  }

  ......

}
```


## License
GPLv2

public class ReactMapViewManager extends SimpleViewManager<ReactMapView> {

    public static final String REACT_CLASS = "RCTImageView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ReactMapView createViewInstance(ThemedReactContext context) {
        return new ReactMapView(context, Fresco.newDraweeControllerBuilder(), mCallerContext);
    }


}

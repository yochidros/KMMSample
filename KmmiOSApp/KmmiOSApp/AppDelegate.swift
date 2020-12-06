import UIKit

@UIApplicationMain
class AppDelegate: UIResponder, UIApplicationDelegate {

    var window: UIWindow?
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
        // Override point for customization after application launch.
        let window = UIWindow()
        window.rootViewController = ViewController.init(nibName: nil, bundle: nil)
        window.backgroundColor = .white
        window.makeKeyAndVisible()
        self.window = window
        return true
    }


}


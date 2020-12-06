//
//  ViewController.swift
//  KmmiOSApp
//
//  Created by miyazawa yoshiki on 2020/12/06.
//  Copyright © 2020 orgName. All rights reserved.
//

import UIKit
import Shared

class ViewController: UIViewController {


    @IBOutlet weak var textView: UITextView!
    override func viewDidLoad() {
        super.viewDidLoad()

        GithubAPI().fetchRepos { (repos) in
            DispatchQueue.main.async {
                self.textView.text = repos.map { $0.name }.joined(separator: "\n")
            }
        }
    }

}

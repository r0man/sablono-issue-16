(defproject issue-16 "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [om "0.3.6"]
                 [com.facebook/react "0.8.0.1"]
                 [sablono "0.2.6"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src"]
  :cljsbuild {
              :builds [{:id "issue-16"
                        :source-paths ["src"]
                        :compiler {:output-to "issue_16.js"
                                   :output-dir "out"
                                   :optimizations :advanced
                                   :externs ["react/externs/react.js"]}}]})

# ProductFlavors

Setting up Flavors in build.gradle

productFlavors {

        staging {
            dimension "version"
            applicationId "in.samset.androidflavorsample.statging"

            //Configure this flavor specific app name published in Play Store
            resValue "string", "flavored_app_name", "Staging App"


        }
        prod {
            dimension "version"
            applicationId "in.samset.androidflavorsample.prod"

            //Configure this flavor specific app name published in Play Store
            resValue "string", "flavored_app_name", "Prod App"

        }
    }
    
 Application Id
 
Each flavor can have its own application Id. An 'applicationId' makes a app in Play Store unique. In this example, the free version will be published on Play Store with packageId/applicationId as n.samset.androidflavorsample.statgingand paid one will have in.samset.androidflavorsample.prod

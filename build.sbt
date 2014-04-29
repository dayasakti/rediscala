//credentials are required for pulling/pushing to/from nexus
credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some(rediscala.builder.Config.nexusPublishPath(RediscalaBuild.getVersion()))
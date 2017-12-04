name := "typescript-to-scala-js-facade"

version := "1.0"

scalaVersion := "2.12.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
 // https://mvnrepository.com/artifact/com.github.julianthome/inmemantlr
//  "com.github.julianthome"          % "inmemantlr"        % "1.3.1",
  "commons-io"                      % "commons-io"        % "2.4",
  "org.antlr"                       % "antlr4-runtime"    % "4.7",
  "org.antlr"                       % "antlr4"            % "4.7",
//  "org.eclipse.jdt.core.compiler"   % "ecj"               % "4.6.1",
  //"org.scalactic"                   % "scalactic"       % "3.0.0",
  "org.scalatest"                   %% "scalatest"        % "3.0.0"   % "test"
)


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Magenta)
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ITWDay7Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    Column(modifier = Modifier.padding(10.dp).fillMaxSize(),

                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement =   Arrangement.Center) {
                        Row {
                            Text(text = "Row 1, Column 1")
                            Text(text = "Row 1, Column 2")
                        }
                        Row {
                            Text(text = "Row 2, Column 1")
                            Text(text = "Row 2, Column 2")
                        }
                    }

                }
            }
        }
    }
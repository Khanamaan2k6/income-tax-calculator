💰 Income Tax Calculator (Java)

This is a simple **Income Tax Calculator** written in Java. It allows users to input their annual income and calculates the tax based on predefined slabs,
then displays the total tax and net income after deductions.

📌 Features

- Takes input from the user via `Scanner`
- Applies multiple income tax slabs:
  - 🟢 **0%** for income ≤ ₹3,00,000
  - 🟡 **5%** for ₹3,00,001 – ₹6,00,000
  - 🟠 **10%** for ₹6,00,001 – ₹9,00,000
  - 🔴 **15%** for ₹9,00,001 – ₹12,00,000
  - 🔵 **20%** for ₹12,00,001 – ₹15,00,000
  - 🟣 **30%** for income > ₹15,00,000
- Calculates and prints:
  - Gross Income
  - Tax Amount
  - Net Income (after tax)

## 🛠️ How It Works

1. The program prompts the user to enter their income.
2. It then checks which slab the income falls under.
3. Based on that, it calculates tax and subtracts it from the original income.
4. Results are displayed on the screen in a readable format.

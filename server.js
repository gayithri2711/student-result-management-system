const express = require("express");
const path = require("path");

const app = express();
const PORT = 3000;

// Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Serve frontend files (index.html)
app.use(express.static(__dirname));

// Simple backend API (test output)
app.get("/api/status", (req, res) => {
    res.json({
        status: "Backend is running successfully",
        project: "Student Result Processing System"
    });
});

// Start server
app.listen(PORT, () => {
    console.log("=================================");
    console.log(" Server started successfully ");
    console.log(` Open http://localhost:${PORT}`);
    console.log("=================================");
});